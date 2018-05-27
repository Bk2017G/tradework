/**
 * 
 */
package com.tradework.resources;

import com.tradework.DAO.LoginDAOImpl;

/**
 * @author Super
 *
 */
public class Factory {
	
	public static LoginDAOImpl createLoginDAO() {
		return new LoginDAOImpl();
	}

}
