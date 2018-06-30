/**
 * 
 */
package src.com.tradework.DAO;

import java.util.List;

import src.com.tradework.bean.EquitySharesBean;
import src.com.tradework.bean.LoginBean;
import src.com.tradework.entity.*;

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
