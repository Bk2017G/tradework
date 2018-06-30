/**
 * 
 */
package src.com.tradework.bean;

import java.util.Date;

/**
 * @author super
 *
 */
public class EquitySharesBean {
	
	private int id;
	private String symbol;
	private String tLColSignal;
	private String definite;
	private Double closePrice;
	private Date date;
	private Double shortBuy;
	private Double longSell;
	private Double stopLoss;
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
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the tLColSignal
	 */
	public String gettLColSignal() {
		return tLColSignal;
	}
	/**
	 * @param tLColSignal the tLColSignal to set
	 */
	public void settLColSignal(String tLColSignal) {
		this.tLColSignal = tLColSignal;
	}
	/**
	 * @return the definite
	 */
	public String getDefinite() {
		return definite;
	}
	/**
	 * @param definite the definite to set
	 */
	public void setDefinite(String definite) {
		this.definite = definite;
	}
	/**
	 * @return the closePrice
	 */
	public Double getClosePrice() {
		return closePrice;
	}
	/**
	 * @param closePrice the closePrice to set
	 */
	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the shortBuy
	 */
	public Double getShortBuy() {
		return shortBuy;
	}
	/**
	 * @param shortBuy the shortBuy to set
	 */
	public void setShortBuy(Double shortBuy) {
		this.shortBuy = shortBuy;
	}
	/**
	 * @return the longSell
	 */
	public Double getLongSell() {
		return longSell;
	}
	/**
	 * @param longSell the longSell to set
	 */
	public void setLongSell(Double longSell) {
		this.longSell = longSell;
	}
	/**
	 * @return the stopLoss
	 */
	public Double getStopLoss() {
		return stopLoss;
	}
	/**
	 * @param stopLoss the stopLoss to set
	 */
	public void setStopLoss(Double stopLoss) {
		this.stopLoss = stopLoss;
	}
	
	

}
