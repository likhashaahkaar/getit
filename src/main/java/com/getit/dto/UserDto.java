package com.getit.dto;

import java.io.Serializable;

import com.getit.util.ValidationUtil;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1996104015215337644L;

	private String userId;
	private String email;
	private String password;
	
	
	
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
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



	public void validate() {
		ValidationUtil.validateEmail(email);
	}
}
