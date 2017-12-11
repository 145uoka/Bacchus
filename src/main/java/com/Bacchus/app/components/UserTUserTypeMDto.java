package com.Bacchus.app.components;

import java.io.Serializable;

/**
 * イベントDTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class UserTUserTypeMDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;


	private Integer userId;

	private String userName;

	private String lastName;

	private String firstName;

	private String email;

	private String password;

	private Integer authLevel;

	private Integer userTypeId;

	private String userTypeName;

	private String subsidyAmount;

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


	public static long getSerialversionuid() {
		return serialVersionUID;
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


	public String getUserTypeName() {
		return userTypeName;
	}


	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}


	public String getSubsidyAmount() {
		return subsidyAmount;
	}


	public void setSubsidyAmount(String subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}





}
