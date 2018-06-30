/**
 * 
 */
package src.com.tradework.resources;

import src.com.tradework.DAO.LoginDAOImpl;
import src.com.tradework.business.service.LoginServiceImpl;

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
