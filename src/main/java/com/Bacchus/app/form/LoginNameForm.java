package  com.Bacchus.app.form;

import java.io.Serializable;

/**
 * ログインフォーム。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class LoginNameForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ログインID */
    private String loginId;

    /** パスワード */
    private String password;

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

}
