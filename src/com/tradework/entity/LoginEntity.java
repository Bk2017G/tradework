/**
 * 
 */
package src.com.tradework.entity;

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
	
	private int userId;
	@Id
	private String userName;
	/**
	 * @return the userid
	 */
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
