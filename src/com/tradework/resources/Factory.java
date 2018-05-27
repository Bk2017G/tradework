/**
 * 
 */
package com.tradework.resources;

import com.tradework.DAO.LoginDAOImpl;
import com.tradework.business.service.LoginServiceImpl;

/**
 * @author Super
 *
 */
public class Factory {
	
	public static LoginDAOImpl createLoginDAO() {
		return new LoginDAOImpl();
	}
	public static LoginServiceImpl createLoginService() {
		return new LoginServiceImpl();
	}

	
}
