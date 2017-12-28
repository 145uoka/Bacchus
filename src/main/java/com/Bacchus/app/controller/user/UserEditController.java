package com.Bacchus.app.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.form.user.UserEditForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserEditService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
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
 * ログイン用コントローラ。
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

        // ユーザー区分のプルダウン項目の取得
        model.addAttribute("userTypeSelectList", userService.createUserTypePullDown());

        // 権限のレベルプルダウン項目の取得
        model.addAttribute("authList", userService.createAuthLevelPullDown(SystemCodeConstants.PLEASE_SELECT_MSG));

        // 編集項目の取得
        model.addAttribute("userTDto", userEditService.selectUser(form));

        // 権限レベルのセット
        form.setAuthLevel(userEditService.selectUser(form).getAuthLevel());

        // ユーザー区分のセット
        form.setUserTypeId(userEditService.selectUser(form).getUserTypeId());

            return ProcConstants.USER + ProcConstants.Operation.EDIT;

    }

    /**
     * ユーザ情報更新処理。
     * @param form
     * @param bindingResult
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.UPDATE, method = RequestMethod.POST)
    public String store(@ModelAttribute("form") UserEditForm form, BindingResult bindingResult, Model model)
            throws Exception {
        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0103);

        // password確認
        if (!StringUtils.equals(form.getPassword(), form.getConfirmPassword())) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            return ProcConstants.USER + ProcConstants.Operation.EDIT;
        }

        // ユニークチェックのためのユーザーデータ取得
        UserT userT = userEditService.validation(form);

        // emailが更新されていた場合true
        if (!(userT.getEmail().equals(form.getEmail()))) {

            // emailのユニークチェック
            UserTCB userTcb = new UserTCB();
            userTcb.query().setEmail_Equal(form.getEmail());
            List<UserT> emailList = userTBhv.readList(userTcb);

            // リストの中身が空でなければtrue
            if (!CollectionUtils.isEmpty(emailList)) {
                model.addAttribute(MODEL_KEY_FORM, form);
                model.addAttribute("errors", bindingResult);
                return ProcConstants.USER + ProcConstants.Operation.EDIT;
            }
        }

        // userNameが更新されていた場合true
        if (!(userT.getUserName().equals(form.getUserName()))) {

            // userNameのユニークチェック
            UserTCB userTcb = new UserTCB();
            userTcb = new UserTCB();
            userTcb.query().setUserName_Equal(form.getUserName());
            List<UserT> userNameList = userTBhv.readList(userTcb);

            if (!CollectionUtils.isEmpty(userNameList)) {
                model.addAttribute(MODEL_KEY_FORM, form);
                model.addAttribute("errors", bindingResult);
                return ProcConstants.USER + ProcConstants.Operation.EDIT;
            }
        }

        // 更新処理
        userEditService.update(form);

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
}
