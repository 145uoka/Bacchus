package  com.Bacchus.app.form;

import java.io.Serializable;

/**
 * ログインフォーム。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class LoginEmailForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** Eメール */
    private String email;

    /** パスワード */
    private String passward;

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
    public String getPassward() {
        return this.passward;
    }

    /**
     * パスワードを設定。
     *
     * @param passward パスワード
     */
    public void setPassward(String passward) {
        this.passward = passward;
    }

}
