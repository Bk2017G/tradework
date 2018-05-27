/**
 * 
 */
package com.tradework.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
/**
 * @author Super
 *
 */
@Entity
@Table(name="BeanTrade")
public class LoginEntity {
	
	private int userid;
	@Id
	private String username;
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
