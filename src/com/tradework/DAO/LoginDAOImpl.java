/**
 * 
 */
package src.com.tradework.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import src.com.tradework.bean.EquitySharesBean;
import src.com.tradework.bean.LoginBean;
import src.com.tradework.entity.BuyShares;
import src.com.tradework.entity.EquityShares;
import src.com.tradework.entity.LoginEntity;
import src.com.tradework.entity.SellShares;
import src.com.tradework.resources.HibernateUtility;

/**
 * @author Super
 *
 */
public class LoginDAOImpl implements LoginDAO {

	/**
	 * This Function will retrieve user data from database
	 */
	
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
	    		loginBean.setUserId(le.getUserId());
	    		loginBean.setUserName(le.getUserName());
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
	public List<EquitySharesBean> giveAllEquityShares() throws Exception {
		
		SessionFactory sessionFactory = null;
		Session session =null;
		List<EquityShares> esEntityList =null;
		List<EquitySharesBean> equitySharesBeans = new ArrayList<EquitySharesBean>();
		EquitySharesBean sharesBean = null;
		try {
			sessionFactory = HibernateUtility.createSessionFactory();
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(EquityShares.class);
			esEntityList = criteria.list();
			for (Iterator<EquityShares> iterator = esEntityList.iterator(); iterator.hasNext();) {
				EquityShares equityShares = (EquityShares) iterator.next();
				sharesBean = new EquitySharesBean();
				if(equityShares.getSymbol() != null) sharesBean.setSymbol(equityShares.getSymbol());
					else continue;
				if(equityShares.getTLColSignal() != null) sharesBean.settLColSignal(equityShares.getTLColSignal());
					else continue;
				if(equityShares.getDefinite() != null) sharesBean.setDefinite(equityShares.getDefinite());
					else continue;
				if(equityShares.getClosePrice() != null) sharesBean.setClosePrice(Double.parseDouble(equityShares.getClosePrice()));
					else continue;
				if(equityShares.getEMA_9() != null) sharesBean.setShortBuy(Double.parseDouble(equityShares.getEMA_9()));
					else continue;
				if(equityShares.getLongEMA_52() != null) sharesBean.setLongSell(Double.parseDouble(equityShares.getLongEMA_52()));
					else continue;
				if(equityShares.getMidEMA_20() != null) sharesBean.setStopLoss(Double.parseDouble(equityShares.getMidEMA_20()));
					else continue;
				sharesBean.setId(sharesBean.getId());
				equitySharesBeans.add(sharesBean);
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
		return equitySharesBeans;
	}
	/**
	 * This function will take all the data for Buying Shares
	 */
	@SuppressWarnings("unchecked")
	
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
