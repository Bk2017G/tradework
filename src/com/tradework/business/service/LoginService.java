/**
 * 
 */
package com.tradework.business.service;

import java.util.List;

import com.tradework.bean.LoginBean;
import com.tradework.bean.PlaceOrderUpstoxBean;

/**
 * @author Super
 *
 */
public interface LoginService {
	public LoginBean getLogin(LoginBean loginBean) throws Exception;
	public List<PlaceOrderUpstoxBean> intraday_Trade() throws Exception;

}
