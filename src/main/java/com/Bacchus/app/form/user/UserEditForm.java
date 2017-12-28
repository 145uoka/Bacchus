package  com.Bacchus.app.form.user;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.Bacchus.webbase.common.beanvalidation.Email;

/**
 * ログインフォーム。
 *
 * @author sagawa_k
 * $Id:$
 */
public class UserEditForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private Integer userId;

	@NotEmpty
	private String userName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String firstName;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	private String password;

	@NotEmpty
	private String confirmPassword;

	@NotEmpty
	private Integer authLevel;

	@NotEmpty
	private Integer userTypeId;



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Integer getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(Integer authLevel) {
		this.authLevel = authLevel;
	}

	public Integer getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}



}
