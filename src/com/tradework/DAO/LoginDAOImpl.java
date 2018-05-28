/**
 * 
 */
package com.tradework.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tradework.bean.LoginBean;
import com.tradework.entity.BuyShares;
import com.tradework.entity.EquityShares;
import com.tradework.entity.LoginEntity;
import com.tradework.entity.SellShares;
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
	    	if( session.isOpen()|| session!=null) {
	    		session.close();
	    	}
	    }
		return loginBean;
	}
	/**
	 * This function will take all the data for EquityShares
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EquityShares> giveAllEquityShares() throws Exception {
		
		SessionFactory sessionFactory = null;
		Session session =null;
		List<EquityShares> esEntityList =null;
		try {
			sessionFactory = HibernateUtility.createSessionFactory();
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(EquityShares.class);
			esEntityList = criteria.list();
			for (Iterator<EquityShares> iterator = esEntityList.iterator(); iterator.hasNext();) {
				EquityShares equityShares = (EquityShares) iterator.next();
				System.out.println(equityShares.toString());
			}
			
		}catch(HibernateException exception) {
			exception.printStackTrace();
	    	throw new Exception("DAO.Technical_Error");
	    }catch(Exception exception) {
	    	throw exception;
	    }finally {
	    	if( session.isOpen()|| session!=null) {
	    		session.close();
	    	}
	    }
		return esEntityList;
	}
	/**
	 * This function will take all the data for Buying Shares
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BuyShares> giveAllBuyShares() throws Exception {
		SessionFactory sessionFactory = null;
		Session session = null;
		List<BuyShares> buyShares = null;
		try {
			sessionFactory = HibernateUtility.createSessionFactory();
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(BuyShares.class);
			buyShares = criteria.list();
			for (Iterator<BuyShares> iterator = buyShares.iterator(); iterator.hasNext();) {
				BuyShares buyShares2 = (BuyShares) iterator.next();
				System.out.println(buyShares2.toString());
			}
		}catch(HibernateException exception) {
			exception.printStackTrace();
	    	throw new Exception("DAO.Technical_Error");
	    }catch(Exception exception) {
	    	throw exception;
	    }finally {
	    	if( session.isOpen()|| session!=null) {
	    		session.close();
	    	}
	    }
		
		return buyShares;
	}
	/**
	 * This function will take all the data for Selling Shares
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SellShares> giveAllSellShares() throws Exception {
		SessionFactory sessionFactory =null;
		Session session = null;
		List<SellShares> listSellShares = null;
		try {
			sessionFactory = HibernateUtility.createSessionFactory();
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(SellShares.class);
			listSellShares = criteria.list();
			for (Iterator<SellShares> iterator = listSellShares.iterator(); iterator.hasNext();) {
				SellShares sellShares = (SellShares) iterator.next();
				System.out.println(sellShares.toString());
			}
			
		}catch(HibernateException exception) {
			exception.printStackTrace();
	    	throw new Exception("DAO.Technical_Error");
	    }catch(Exception exception) {
	    	throw exception;
	    }finally {
	    	if( session.isOpen()|| session!=null) {
	    		session.close();
	    	}
	    }
		return listSellShares;
	}

}
