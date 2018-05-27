/**
 * 
 */
package com.tradework.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tradework.bean.LoginBean;
import com.tradework.resources.HibernateUtility;

/**
 * @author Super
 *
 */
public class LoginDAOImpl implements LoginDAO {

	/**
	 * This Function will retrieve user data from database
	 */
	@Override
	public LoginBean checkLogin(String userName) throws Exception {
		SessionFactory sessionFactory=null;
	    Session session=null;
	    LoginBean loginBean = null;
	    try {
	    	sessionFactory = HibernateUtility.createSessionFactory();
	    	session = sessionFactory.openSession();
	    	
	    }catch(HibernateException exception) {
	    	throw new Exception("DAO.Technical_Error");
	    }catch(Exception exception) {
	    	throw exception;
	    }finally {
	    	
	    }
		return loginBean;
	}

}
