package com.Bacchus.app.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.user.UserCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserCreateService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * ユーザー新規登録画面コントローラー
 *
 * @author sagawa_k
 */
@Controller
@RequestMapping(value = ProcConstants.USER)
public class UserCreateController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    UserCreateService userCreateService;

    @Autowired
    UserService userService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    /**
     * ログイン後TOP処理
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.CREATE, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserCreateForm form, BindingResult bindingResult, Model model)
            throws Exception {
        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0102);

        initPulldown(model);

        return ProcConstants.USER + ProcConstants.Operation.CREATE;

    }

    /**
     * @param model
     */
    private void initPulldown(Model model) {
        // 権限のレベルプルダウン項目の取得
        model.addAttribute("authList", userService.createAuthLevelPullDown(SystemCodeConstants.PLEASE_SELECT_MSG));

        // ユーザー区分のプルダウン項目の取得
        model.addAttribute("userTypeSelectList", userService.createUserTypePullDown());
    }

    @RequestMapping(value = ProcConstants.Operation.STORE, method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") UserCreateForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0102);

        // validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            initPulldown(model);
            return ProcConstants.USER + ProcConstants.Operation.CREATE;
        }

        List<String> messageList = null;
        String message = null;

        // password確認
        if (!StringUtils.equals(form.getPassword(), form.getConfirmPassword())) {
            bindingResult.rejectValue("password",null, null, "");
            bindingResult.rejectValue("confirmPassword",null, null, "");
            message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.EXISTS_NOT_SET_PASSWORD),
                    new String[]{"パスワード", "新しいパスワード", "確認用パスワード"},
                    Locale.getDefault());
        }

        // 権限の存在チェック
        Integer authLevel = Integer.parseInt(form.getAuthLevel());
        if (!userService.isExistsAuth(authLevel)) {
            bindingResult.rejectValue("authLevel", MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.GlueNetValidator.INVALID),null, "");
        }

        // ユーザ種別の存在チェック
        Integer userTypeId = Integer.parseInt(form.getUserTypeId());
        if (!userService.isExistsAuth(authLevel)) {
            bindingResult.rejectValue("userTypeId", MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.GlueNetValidator.INVALID),null, "");
        }

        // ログインIDのユニークチェック
        int userCount = userTBhv.selectCount(cb -> {
            cb.query().setLoginId_Equal(form.getLoginId());
        });

        if (userCount > 0) {
            bindingResult.rejectValue("loginId", MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.ALREADY_USED),
                    new String[]{"このログインID"}, "");
        }

        // validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            model.addAttribute(MessageType.ERROR, messageList);
            initPulldown(model);
            return ProcConstants.USER + ProcConstants.Operation.CREATE;
        }


        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(form, userDto);
        userDto.setUserTypeId(userTypeId);
        userDto.setAuthLevel(authLevel);

        // DB登録
        userDto = userCreateService.register(userDto);

        // 完了メッセージを設定
        message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_01_0001, new Object[] { userDto.getUserId(),
                userDto.getLastName(), userDto.getFirstName() });

        return redirect(ProcConstants.USER + ProcConstants.Operation.INDEX);
    }
}
