/**
 * 
 */
package com.tradework.Tester;

import com.tradework.API.userAPI;
import com.tradework.DAO.LoginDAO;
import com.tradework.bean.LoginBean;
import com.tradework.business.service.LoginService;
import com.tradework.resources.Factory;
import com.tradework.resources.JSONParser;


/**
 * @author super
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginBean bean = new LoginBean();
		bean.setUserName("saurabh");
		LoginDAO dao = Factory.createLoginDAO();
		userAPI api = new userAPI();
		String data = null;
		try {
			LoginService loginService =Factory.createLoginService();
			LoginBean bean2=loginService.getLogin(bean);
			System.out.println(bean2.getUserId()+" "+bean2.getUserName());
			bean.setUserName("Abhishek");
			bean2=loginService.getLogin(bean);
			
			System.out.println(bean2.getUserId()+" "+bean2.getUserName());
			dao.giveAllBuyShares();
			dao.giveAllEquityShares();
			dao.giveAllSellShares();
			data = JSONParser.toJson(bean2);
			api.userLogin(data);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (int i = 0; i >=0; i++) {
//			Supporting supporting = new Supporting();
//			
//		}

	}
	

}