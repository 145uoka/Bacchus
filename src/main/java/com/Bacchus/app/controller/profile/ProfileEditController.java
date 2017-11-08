package com.Bacchus.app.controller.profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.optional.OptionalEntity;
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
import com.Bacchus.app.form.profile.ProfileEditForm;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.pfofile.ProfileService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.Permission;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * プロフィール管理:編集用コントローラ。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Controller
@Permission({ SystemCodeConstants.Permissions.ADMIN, SystemCodeConstants.Permissions.GENERAL })
public class ProfileEditController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    ProfileService profileService;

    /** プロフィール管理:編集 */
    private final String INDEX_VIEW = "/profile/edit";

    /**
     * プロフィール管理:編集
     *
     * @param form Form
     * @param bindingResult バリデーション結果
     * @param redirectAttributes リダイレクト属性
     * @param model モデル
     * @return /profile/edit
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = INDEX_VIEW, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") ProfileEditForm form,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) throws RecordNotFoundException {

        // 画面名の設定
        super.setDisplayTitle(model, DisplayIdConstants.Profile.BACCHUS_0103);

        // ログインユーザーのユーザ情報を取得
        OptionalEntity<UserT> usertT = userTBhv.selectByPK(userInfo.getUserId());
        if (usertT.isPresent() && usertT != null) {
            form.setUserName(usertT.get().getUserName());
            form.setEmail(usertT.get().getEmail());
        } else {
            throw new RecordNotFoundException("USER_T", userInfo.getUserId());
        }

        model.addAttribute("form", form);

        return INDEX_VIEW;
    }

    /**
     * プロフィール管理:編集の更新処理。
     *
     * @param form フォーム
     * @param bindingResult バリデーション結果
     * @param redirectAttributes リダイレクト属性
     * @param model モデル
     * @return /profile/show
     */
    @RequestMapping(value = INDEX_VIEW + "/update", method = RequestMethod.POST)
    public String update(@Validated @ModelAttribute("form") ProfileEditForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) {

        List<String> messageList = this.validate(form, bindingResult);

        // validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            super.setDisplayTitle(model, DisplayIdConstants.Profile.BACCHUS_0103);
            model.addAttribute(MessageType.ERROR, messageList);
            return INDEX_VIEW;
        }

        // プロフィール編集
        profileService.updateProfile(form);

        // 完了メッセージを設定
        String message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                MessageKeyConstants.Success.UPDATE),
                null,
                Locale.getDefault());
        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_01_0301, new Object[] {
                userInfo.getUserId(),
                userInfo.getUserName(),
                userInfo.getEmail()
                });

        return super.redirect(INDEX_VIEW);
    }

    /**
     * validate処理。
     * <p>
     * 入力値の相関チェックを実施。
     *
     * @param form プロフィール編集用Form
     * @param bindingResult BindingResult
     * @return エラーメッセージリスト
     */
    private List<String> validate(ProfileEditForm form, BindingResult bindingResult) {

        List<String> messageList = null;
        String message = null;

        if (StringUtils.isBlank(form.getPassword()) &&
                StringUtils.isBlank(form.getNewPassword()) &&
                StringUtils.isBlank(form.getConfirmPassword())) {

        } else if (StringUtils.isNotBlank(form.getPassword()) ||
                StringUtils.isNotBlank(form.getNewPassword()) ||
                StringUtils.isNotBlank(form.getConfirmPassword())) {
            // 現PWD、新PWD、確認PWDのいずれかが未入力
            bindingResult.rejectValue("password",null, null, "");
            bindingResult.rejectValue("newPassword",null, null, "");
            bindingResult.rejectValue("confirmPassword",null, null, "");
            message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.EXISTS_NOT_SET_PASSWORD),
                    new String[]{"パスワード", "新しいパスワード", "確認用パスワード"},
                    Locale.getDefault());

        } else if (!StringUtils.equals(form.getNewPassword(), form.getConfirmPassword())) {
            // 新PWDと確認PWDが異なる
            bindingResult.rejectValue("newPassword",null, null, "");
            bindingResult.rejectValue("confirmPassword",null, null, "");
            message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.DIFFERENT_NEWPASSWORD),
                    new String[]{"新しいパスワード", "確認用パスワード"},
                    Locale.getDefault());

        } else if (StringUtils.equals(form.getPassword(), form.getNewPassword())) {
            // 現PWDと新PWDが同じ
            bindingResult.rejectValue("password",null, null, "");
            bindingResult.rejectValue("newPassword",null, null, "");
            bindingResult.rejectValue("confirmPassword",null, null, "");
            message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.SAME_NEWPASSWORD),
                    new String[]{"パスワード", "新しいパスワード"},
                    Locale.getDefault());

        } else {
            // 現PWDが登録値と異なる
            String encPassword = EncryptUtil.saltHash(form.getPassword(), EncryptUtil.EncryptType.MD5);

            UserTCB cb = new UserTCB();
            cb.query().setUserId_Equal(userInfo.getUserId());
            cb.query().setPassword_Equal(encPassword);
            int cnt = userTBhv.readCount(cb);

            if (cnt <= 0) {

                bindingResult.rejectValue("password",null, null, "");
                message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
                        MessageKeyConstants.Error.DIFFERENT_PASSWORD),
                        new String[]{"パスワード"},
                        Locale.getDefault());
            }
        }

        if (StringUtils.isNotBlank(message)) {
            messageList = new ArrayList<String>(Arrays.asList(message));
        }
        return messageList;
    }
}
