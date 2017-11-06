package  com.Bacchus.app.form.userMng;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * ログインフォーム。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class UserAddForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String userName;

	@NotEmpty
	private String email;

	@NotEmpty
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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



}
