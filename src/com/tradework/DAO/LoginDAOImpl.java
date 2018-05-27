/**
 * 
 */
package com.tradework.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tradework.bean.LoginBean;
import com.tradework.entity.LoginEntity;
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
	    	
	    	LoginEntity le =(LoginEntity) session.get(LoginEntity.class, userName);
	    	if(le!=null) {
	    		
	    		loginBean = new LoginBean();
	    		loginBean.setUserId(le.getUserid());
	    		loginBean.setUserName(le.getUsername());
	    	}else {
	    		loginBean = new LoginBean();
	    		loginBean.setUserId(-1);
	    		loginBean.setUserName("UNDEFINED");
	    	}
	    	
	    }catch(HibernateException exception) {
	    	throw new Exception("DAO.Technical_Error");
	    }catch(Exception exception) {
	    	throw exception;
	    }finally {
//	    	if(session!=null || session.isOpen()) {
//	    		session.close();
//	    	}
	    }
	    System.out.println("Hi there "+loginBean.getUserId()+" "+loginBean.getUserName());
		return loginBean;
	}

}
