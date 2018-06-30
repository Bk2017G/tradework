/**
 * 
 */
package src.com.tradework.business.service;

import java.util.List;

import src.com.tradework.bean.LoginBean;
import src.com.tradework.bean.PlaceOrderUpstoxBean;

/**
 * @author Super
 *
 */
public interface LoginService {
	public LoginBean getLogin(LoginBean loginBean) throws Exception;
	public List<PlaceOrderUpstoxBean> intraday_Trade() throws Exception;

}
