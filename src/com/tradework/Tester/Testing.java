/**
 * 
 */
package com.tradework.Tester;

import com.tradework.bean.LoginBean;
import com.tradework.business.service.LoginService;
import com.tradework.resources.Factory;


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
		bean.setUserName("andy");
		try {
			LoginService loginService =Factory.createLoginService();
			LoginBean bean2=loginService.getLogin(bean);
			System.out.println(bean2.getUserId()+" "+bean2.getUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
