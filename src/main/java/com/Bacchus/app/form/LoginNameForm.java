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

    /** ユーザー名 */
    private String userName;

    /** パスワード */
    private String password;

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
