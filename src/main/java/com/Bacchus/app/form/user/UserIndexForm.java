package  com.Bacchus.app.form.user;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.Bacchus.app.components.UserDto;

/**
 * ログインフォーム。
 *
 * @author sagawa_k
 * $Id:$
 */
public class UserIndexForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	 /** [雇用契約_M]DTOリスト */
    private List<UserDto> UserDtoList;

    /**
     * [雇用契約_M]DTOリストの取得。
     *
     * @return [雇用契約_M]DTOリスト
     */
    public List<UserDto> getUserTList() {
        return this.UserDtoList;
    }

    /**
     * [雇用契約_M]DTOリストを設定。
     *
     * @param empContractDtoList [雇用契約_M]DTOリスト
     */
    public void setUserDtoList(List<UserDto> UserDtoList) {
        this.UserDtoList = UserDtoList;
    }


	@NotEmpty
	private Integer userId;

	@NotEmpty
	private String userName;

	@NotEmpty
	private String email;

	@NotEmpty
	private String password;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
