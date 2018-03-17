package com.Bacchus.app.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.user.UserEditForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserEditService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * ユーザー編集画面コントローラー
 *
 * @author ishigouoka_k $Id: LoginController.java 591 2017-08-08 07:48:14Z
 *         kanai_y@glue-si.com $
 */
@Controller
@RequestMapping(value = ProcConstants.USER)
public class UserEditController extends BaseController {

    @Autowired
    UserEditService userEditService;

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    UserService userService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    /**
     * ユーザ編集画面表示。
     *
     * @param model
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.EDIT, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserEditForm form, Model model) throws Exception {
        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0103);

//        // ユーザー区分のプルダウン項目の取得
//        model.addAttribute("userTypeSelectList", userService.createUserTypePullDown());
//
//        // 権限のレベルプルダウン項目の取得
//        model.addAttribute("authList", userService.createAuthLevelPullDown(SystemCodeConstants.PLEASE_SELECT_MSG));

        initPulldown(model);

        // 編集項目の取得
        model.addAttribute("userTDto", userEditService.selectUser(form));

        // 権限レベルのセット
        form.setAuthLevel(String.valueOf(userEditService.selectUser(form).getAuthLevel()));

        // ユーザー区分のセット
        form.setUserTypeId(String.valueOf(userEditService.selectUser(form).getUserTypeId()));

            return ProcConstants.USER + ProcConstants.Operation.EDIT;

    }

    /**
     * ユーザ情報更新処理。
     * @param form
     * @param bindingResult
     * @param redirectAttributes
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.UPDATE, method = RequestMethod.POST)
    public String update(@Validated @ModelAttribute("form") UserEditForm form, BindingResult bindingResult,RedirectAttributes redirectAttributes, Model model)
            throws Exception {
        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0103);

        List<String> messageList = null;
        String message = null;

        // password確認
//        if (!StringUtils.equals(form.getPassword(), form.getConfirmPassword())) {
//            bindingResult.rejectValue("password",null, null, "");
//            bindingResult.rejectValue("confirmPassword",null, null, "");
//            message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
//                    MessageKeyConstants.Error.EXISTS_NOT_SET_PASSWORD),
//                    new String[]{"パスワード", "新しいパスワード", "確認用パスワード"},
//                    Locale.getDefault());
//        }

        // ユニークチェックのためのユーザーデータ取得
        UserT userT = userEditService.validation(form);

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

        if(!StringUtils.equals(userT.getLoginId(), form.getLoginId())){
        	int userCount = userTBhv.selectCount(cb -> {
                cb.query().setLoginId_Equal(form.getLoginId());
            });

            if (userCount > 0) {
                bindingResult.rejectValue("loginId", MessageKeyUtil.encloseStringDelete(
                        MessageKeyConstants.Error.ALREADY_USED),
                        new String[]{"このログインID"}, "");
            }
        }

        // validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            model.addAttribute(MessageType.ERROR, messageList);
            initPulldown(model);
            return ProcConstants.USER + ProcConstants.Operation.EDIT;
        }

//        // emailが更新されていた場合true
//        if (!userService.isExistsEmail(form.getEmail())) {
//            // emailのユニークチェック
//            UserTCB userTcb = new UserTCB();
//            userTcb.query().setEmail_Equal(form.getEmail());
//            List<UserT> emailList = userTBhv.readList(userTcb);
//
//            // リストの中身が空でなければtrue
//            if (!CollectionUtils.isEmpty(emailList)) {
//                model.addAttribute(MODEL_KEY_FORM, form);
//                model.addAttribute("errors", bindingResult);
//                return ProcConstants.USER + ProcConstants.Operation.EDIT;
//            }
//        }

        // userNameが更新されていた場合true
//        if (!userService.isExistsUserName(form.getUserName())) {
//
//            // userNameのユニークチェック
//            UserTCB userTcb = new UserTCB();
//            userTcb = new UserTCB();
//            userTcb.query().setUserName_Equal(form.getUserName());
//            List<UserT> userNameList = userTBhv.readList(userTcb);
//
//            if (!CollectionUtils.isEmpty(userNameList)) {
//                model.addAttribute(MODEL_KEY_FORM, form);
//                model.addAttribute("errors", bindingResult);
//                return ProcConstants.USER + ProcConstants.Operation.EDIT;
//            }
//        }

        UserDto userDto = new UserDto();
        userDto.setUserId(form.getUserId());
        userDto.setFirstName(form.getFirstName());
        userDto.setLastName(form.getLastName());
        userDto.setAuthLevel(authLevel);
        userDto.setUserTypeId(userTypeId);
        userDto.setPassword(form.getPassword());

        // 更新処理
        userEditService.update(userDto);

        // 完了メッセージを設定
        message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.UPDATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // 一覧画面へリダイレクトする
        return super.redirect(ProcConstants.USER + ProcConstants.Operation.INDEX);

    }

    /**
     * 削除ボタン押下時の処理
     *
     * @param form
     * @param bindingResult
     * @param redirectAttributes
     * @param model
     * @return
     * @throws RecordNotFoundException
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.DELETE, method = RequestMethod.POST)
    public String delete(@ModelAttribute("form") UserEditForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws RecordNotFoundException {

        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0103);

        // ユーザー削除
        userService.delete(form.getUserId());

        // 完了メッセージを設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.DELETE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // 一覧画面へリダイレクトする
        return super.redirect(ProcConstants.USER + ProcConstants.Operation.INDEX);

    }

    /**
     * 画面.プルダウン項目の設定を行う。
     *
     * @param model
     */
   private void initPulldown(Model model){

	   // ユーザー区分のプルダウン項目の取得
       model.addAttribute("userTypeSelectList", userService.createUserTypePullDown());

       // 権限のレベルプルダウン項目の取得
       model.addAttribute("authList", userService.createAuthLevelPullDown(SystemCodeConstants.PLEASE_SELECT_MSG));

//       // 権限レベルのセット
//       form.setAuthLevel(userEditService.selectUser(form).getAuthLevel());
//
//       // ユーザー区分のセット
//       form.setUserTypeId(userEditService.selectUser(form).getUserTypeId());
   }
}
