package  com.Bacchus.app.form.profile;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * プロフィール編集用Form。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class ProfileEditForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ユーザー名 */
    @NotEmpty
    private String userName;

    /** Eメール */
    @NotEmpty
    private String email;

    /** 現在のPWD */
    private String password;

    /** 新しいPWD */
    private String newPassword;

    /** 確認用PWD */
    private String confirmPassword;

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
     * 現在のPWDの取得。
     *
     * @return 現在のPWD
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 現在のPWDを設定。
     *
     * @param password 現在のPWD
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 新しいPWDの取得。
     *
     * @return 新しいPWD
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * 新しいPWDを設定。
     *
     * @param newPassword 新しいPWD
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * 確認用PWDの取得。
     *
     * @return 確認用PWD
     */
    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    /**
     * 確認用PWDを設定。
     *
     * @param confirmPassword 確認用PWD
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
