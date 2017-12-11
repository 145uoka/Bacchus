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
public class UserCreateForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

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
	private String authLevel;

	@NotEmpty
	private String userTypeId;

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



}
