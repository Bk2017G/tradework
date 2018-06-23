/**
 * 
 */
package com.tradework.DAO;

import java.util.List;

import com.tradework.bean.EquitySharesBean;
import com.tradework.bean.LoginBean;
import com.tradework.entity.*;

/**
 * @author Super
 *
 */
public interface LoginDAO {
	public LoginBean checkLogin(String userName) throws Exception; 
	public List<EquitySharesBean> giveAllEquityShares() throws Exception;
	public List<BuyShares> giveAllBuyShares() throws Exception;
	public List<SellShares> giveAllSellShares() throws Exception;

}
