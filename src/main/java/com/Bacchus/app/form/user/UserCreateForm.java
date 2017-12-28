package com.Bacchus.app.form.user;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.Bacchus.webbase.common.beanvalidation.Email;
import com.Bacchus.webbase.common.beanvalidation.Number;
import com.Bacchus.webbase.common.constants.MessageKeyConstants.GlueNetValidator;

/**
 * ユーザー登録Form。
 *
 * @author ishigouoka_k
 */
public class UserCreateForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ログインID */
    @NotEmpty
    private String loginId;

    /** ユーザー名 */
    private String userName;

    /** 苗字(氏) */
    @NotEmpty
    private String lastName;

    /** 名前(名) */
    @NotEmpty
    private String firstName;

    /** Eメール */
    @Email
    private String email;

    /** パスワード */
    @NotEmpty
    private String password;

    /** パスワード確認 */
    @NotEmpty
    private String confirmPassword;

    /** ユーザー区分ID */
    @NotEmpty
    @Number(message=GlueNetValidator.INVALID)
    private String userTypeId;

    /** 権限レベル */
    @NotEmpty
    @Number(message=GlueNetValidator.INVALID)
    private String authLevel;

    /**
     * ログインIDの取得。
     *
     * @return ログインID
     */
    public String getLoginId() {
        return this.loginId;
    }

    /**
     * ログインIDを設定。
     *
     * @param loginId ログインID
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * ユーザー名の取得。
     *
     * @return ユーザー名
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * ユーザー名を設定。
     *
     * @param userName ユーザー名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 苗字(氏)の取得。
     *
     * @return 苗字(氏)
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 苗字(氏)を設定。
     *
     * @param lastName 苗字(氏)
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 名前(名)の取得。
     *
     * @return 名前(名)
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 名前(名)を設定。
     *
     * @param firstName 名前(名)
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Eメールの取得。
     *
     * @return Eメール
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Eメールを設定。
     *
     * @param email Eメール
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * パスワードの取得。
     *
     * @return パスワード
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * パスワードを設定。
     *
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * パスワード確認の取得。
     *
     * @return パスワード確認
     */
    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    /**
     * パスワード確認を設定。
     *
     * @param confirmPassword パスワード確認
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * ユーザー区分IDの取得。
     *
     * @return ユーザー区分ID
     */
    public String getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * ユーザー区分IDを設定。
     *
     * @param userTypeId ユーザー区分ID
     */
    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * 権限レベルの取得。
     *
     * @return 権限レベル
     */
    public String getAuthLevel() {
        return this.authLevel;
    }

    /**
     * 権限レベルを設定。
     *
     * @param authLevel 権限レベル
     */
    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

}
