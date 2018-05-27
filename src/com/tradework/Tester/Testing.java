/**
 * 
 */
package com.tradework.Tester;

import com.tradework.bean.LoginBean;
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
			Factory.createLoginService().getLogin(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
