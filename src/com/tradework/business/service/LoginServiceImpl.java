/**
 * 
 */
package com.tradework.business.service;

import java.util.ArrayList;
import java.util.List;

import com.tradework.bean.EquitySharesBean;
import com.tradework.bean.LoginBean;
import com.tradework.bean.PlaceOrderUpstoxBean;
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

	@Override
	public List<PlaceOrderUpstoxBean> intraday_Trade() throws Exception {
		List<EquitySharesBean> listEquity = Factory.createLoginDAO().giveAllEquityShares();
		List<PlaceOrderUpstoxBean> orderUpstoxBeans = new ArrayList<PlaceOrderUpstoxBean>();
		PlaceOrderUpstoxBean orderUpstoxBean = null;
		for (EquitySharesBean equityShares : listEquity) {
			if(equityShares.gettLColSignal().equalsIgnoreCase(equityShares.getDefinite())) {
				if((equityShares.getClosePrice() > equityShares.getShortBuy())){
					if(equityShares.gettLColSignal().equalsIgnoreCase("buy")) {
						orderUpstoxBean = new PlaceOrderUpstoxBean();
						orderUpstoxBean.setTransaction_type('b');
						orderUpstoxBean.setExchange("NSE_EQ");
						orderUpstoxBean.setSymbol(equityShares.getSymbol().toUpperCase());
						orderUpstoxBean.setQuantity(50);
						orderUpstoxBean.setOrder_type("m");
						orderUpstoxBean.setProduct("I");
						orderUpstoxBeans.add(orderUpstoxBean);
					}
				}
			}
		}
		
		return orderUpstoxBeans;
	}

}
