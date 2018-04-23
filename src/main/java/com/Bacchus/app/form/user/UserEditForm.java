package  com.Bacchus.app.form.user;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * ログインフォーム。
 *
 * @author sagawa_k
 * $Id:$
 */
public class UserEditForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

//	@NotEmpty
//	private String userName;

	@NotNull
	private Integer userId;

    /** ログインID */

	
    private String loginId;

    private String loginCheck;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String firstName;

//	@NotEmpty
//	@Email
//	private String email;


	private String firstPassward;


	private String confirmPassword;

	private String passwardCheck;

	@NotEmpty
	private String authLevel;

	@NotEmpty
	private String userTypeId;



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public String getfirstPassward() {
		return firstPassward;
	}

	public void setfirstPassward(String firstPassward) {
		this.firstPassward = firstPassward;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}

	public String getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getLoginCheck() {
		return loginCheck;
	}

	public void setLoginCheck(String loginCheck) {
		this.loginCheck = loginCheck;
	}

	public String getPasswardCheck() {
		return passwardCheck;
	}

	public void setPasswardCheck(String passwardCheck) {
		this.passwardCheck = passwardCheck;
	}



}
