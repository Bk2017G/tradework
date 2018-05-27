/**
 * 
 */
package com.tradework.business.service;

import com.tradework.bean.LoginBean;
import com.tradework.resources.Factory;

/**
 * @author dev
 *
 */
public class LoginServiceImpl implements LoginService {

	@Override
	public LoginBean getLogin(LoginBean loginBean) throws Exception {
		// TODO Auto-generated method stub
		return Factory.createLoginDAO().checkLogin(loginBean.getUserName());
	}

}
