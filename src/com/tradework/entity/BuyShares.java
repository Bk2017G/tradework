/**
 * 
 */
package src.com.tradework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author super
 *
 */
@Entity
@Table(name="tradeSetup_tickbyticklist")
public class BuyShares {
	@Id
	private int id;
	private String Symbol;
	private String BuySell;
	private String Quantity;
	private String Price;
	private String StopLoss;
	private String TargetPrice;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return Symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	/**
	 * @return the buySell
	 */
	public String getBuySell() {
		return BuySell;
	}
	/**
	 * @param buySell the buySell to set
	 */
	public void setBuySell(String buySell) {
		BuySell = buySell;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return Quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		Price = price;
	}
	/**
	 * @return the stopLoss
	 */
	public String getStopLoss() {
		return StopLoss;
	}
	/**
	 * @param stopLoss the stopLoss to set
	 */
	public void setStopLoss(String stopLoss) {
		StopLoss = stopLoss;
	}
	/**
	 * @return the targetPrice
	 */
	public String getTargetPrice() {
		return TargetPrice;
	}
	/**
	 * @param targetPrice the targetPrice to set
	 */
	public void setTargetPrice(String targetPrice) {
		TargetPrice = targetPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BuyShares [id=" + id + ", Symbol=" + Symbol + ", BuySell=" + BuySell + ", Quantity=" + Quantity
				+ ", Price=" + Price + ", StopLoss=" + StopLoss + ", TargetPrice=" + TargetPrice + "]";
	}
	
}
