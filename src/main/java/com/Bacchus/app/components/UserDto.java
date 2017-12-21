package  com.Bacchus.app.components;

import java.io.Serializable;

/**
 * ユーザ情報。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class UserDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 権限レベル */
    private Integer authLevel;

    /** Eメール */
    private String email;

    /** 氏 */
    private String firstName;

    /** 名 */
    private String lastName;

    /** Lineフラグ */
    private Integer lineFlg;

    /** LineID */
    private String lineId;

    /** ログインID */
    private String loginId;

    /** 暗号化パスワード */
    private String password;

    /** ユーザID */
    private Integer userId;

    /** ユーザ名 */
    private String userName;

    /** ユーザ区分ID */
    private Integer userTypeId;


    private String userTypeName;
    /**
     * 権限レベルの取得。
     *
     * @return 権限レベル
     */
    public Integer getAuthLevel() {
        return this.authLevel;
    }

    /**
     * 権限レベルを設定。
     *
     * @param authLevel 権限レベル
     */
    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
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
     * 氏の取得。
     *
     * @return 氏
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 氏を設定。
     *
     * @param firstName 氏
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 名の取得。
     *
     * @return 名
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 名を設定。
     *
     * @param lastName 名
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Lineフラグの取得。
     *
     * @return Lineフラグ
     */
    public Integer getLineFlg() {
        return this.lineFlg;
    }

    /**
     * Lineフラグを設定。
     *
     * @param lineFlg Lineフラグ
     */
    public void setLineFlg(Integer lineFlg) {
        this.lineFlg = lineFlg;
    }

    /**
     * LineIDの取得。
     *
     * @return LineID
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * LineIDを設定。
     *
     * @param lineId LineID
     */
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

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
     * 暗号化パスワードの取得。
     *
     * @return 暗号化パスワード
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 暗号化パスワードを設定。
     *
     * @param password 暗号化パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ユーザIDの取得。
     *
     * @return ユーザID
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * ユーザIDを設定。
     *
     * @param userId ユーザID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ユーザ名の取得。
     *
     * @return ユーザ名
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * ユーザ名を設定。
     *
     * @param userName ユーザ名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * ユーザ区分IDの取得。
     *
     * @return ユーザ区分ID
     */
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * ユーザ区分IDを設定。
     *
     * @param userTypeId ユーザ区分ID
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

}
