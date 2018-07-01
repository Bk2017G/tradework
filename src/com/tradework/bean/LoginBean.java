/**
 * 
 */
package com.tradework.bean;

/**
 * @author super
 *
 */
public class LoginBean {
	
	private int userId;
	private String userName;
	private String message;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
