/**
 * 
 */
package com.tradework.DAO;

import com.tradework.bean.LoginBean;

/**
 * @author Super
 *
 */
public interface LoginDAO {
	public LoginBean checkLogin(String userName) throws Exception; 

}
