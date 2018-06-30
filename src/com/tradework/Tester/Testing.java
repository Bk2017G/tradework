/**
 * 
 */
package src.com.tradework.Tester;

import java.util.List;

import src.com.tradework.API.userAPI;
import src.com.tradework.DAO.LoginDAO;
import src.com.tradework.bean.LoginBean;
import src.com.tradework.bean.PlaceOrderUpstoxBean;
import src.com.tradework.business.service.LoginService;
import src.com.tradework.resources.Factory;
import src.com.tradework.resources.JSONParser;


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
		userAPI api = new userAPI();
//		System.out.println(api.login());
		
		LoginBean bean = new LoginBean();
		bean.setUserName("saurabh");
		LoginDAO dao = Factory.createLoginDAO();
//		userAPI api = new userAPI();
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
			/*PlaceOrderUpstoxBean orderUpstoxBean = new PlaceOrderUpstoxBean();
			orderUpstoxBean.setTransaction_type('b');
			orderUpstoxBean.setExchange("NSE_EQ");
			orderUpstoxBean.setSymbol("YES BANK");
			orderUpstoxBean.setQuantity(50);
			orderUpstoxBean.setOrder_type("m");
			orderUpstoxBean.setProduct("I");*/
			List<PlaceOrderUpstoxBean> orderUpstoxBeans =  loginService.intraday_Trade();
			for (PlaceOrderUpstoxBean orderUpstoxBean : orderUpstoxBeans) {
				System.out.println(JSONParser.toJson(orderUpstoxBean));
			}
			System.out.println("****************************");
			System.out.println(api.userLogin(data));
			
			
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