package com.Bacchus.app.controller.user;

import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.form.user.UserEditingForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserCreateService;
import com.Bacchus.app.service.user.UserEditingService;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k $Id: LoginController.java 591 2017-08-08 07:48:14Z
 *         kanai_y@glue-si.com $
 */
@Controller
@RequestMapping(value = ProcConstants.USER)
public class UserEditingController extends BaseController {

    @Autowired
    UserEditingService userEditingService;

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    UserCreateService userCreateService;

    @Autowired
    UserCreateService userService;

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
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.EDIT, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserEditingForm form, Model model) throws Exception {
        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0103);

        // ユーザー区分のプルダウン項目の取得
        model.addAttribute("userTypeSelectList", userEditingService.userTypePullDown());

        // 権限のレベルプルダウン項目の取得
        model.addAttribute("entrySelectList", userEditingService.authLevelPullDown());

        // 編集項目の取得
        model.addAttribute("userTDto", userEditingService.selectUser(form));

        // 権限レベルのセット
        form.setAuthLevel(userEditingService.selectUser(form).getAuthLevel());

        // ユーザー区分のセット
        form.setUserTypeId(userEditingService.selectUser(form).getUserTypeId());

        return ProcConstants.USER + ProcConstants.Operation.EDIT;

    }

    @RequestMapping(value = ProcConstants.Operation.UPDATE, method = RequestMethod.POST)
    public String store(@ModelAttribute("form") UserEditingForm form, BindingResult bindingResult, Model model)
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
        UserT userT = userEditingService.validation(form);

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
        userEditingService.update(form);

        // 一覧画面へリダイレクトする
        return super.redirect(ProcConstants.USER + ProcConstants.Operation.INDEX);

    }
}
