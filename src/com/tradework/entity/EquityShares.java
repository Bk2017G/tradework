/**
 * 
 */
package com.tradework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author super
 *
 */
@Entity
@Table(name="tradeSetup_chartindicatorsintraday")
public class EquityShares {
	@Id
	private int id;
	private String Symbol;
	private String GMMA;
	private String ADX_DMI;
	private String TrendLine;
	private String BuySell;
	private String Swing;
	private String FiboBuySell;
	private String FiboPriceatTrigger;
	private String FiboStopLoss;
	private String FiboFirstTarget;
	private String FiboSecondTarget;
	private String PerformanceCheckSignal;
	private String AppelROCSignal;
	private String VolumeOscillatorSignal;
	private String GordonRoseSignal;
	private String RSIValue;
	private String VolumeAdverseRatio;
	private String MACDSignal;
	private String TLColSignal;
	private String MagicalTrendIndicatorUpdate;
	private String MACDBlack;
	private String GordonRoseIndicator;
	private String BuySellSignal;
	private String DailyAverageBearVol;
	private String DailyAverageBullVol;
	private String DailyPivot;
	private String DailyResistance1;
	private String DailyResistance2;
	private String DailyResistance3;
	private String DailySupport1;
	private String DailySupport2;
	private String DailySupport3;
	private String Definite;
	private String HH;
	private String HL;
	private String LH;
	private String LL;
	private String LongMA_100;
	private String MA_5;
	private String MidMA_45;
	private String MonthlyPivot;
	private String MonthlyResistance1;
	private String MonthlyResistance2;
	private String MonthlyResistance3;
	private String MonthlySupport1;
	private String MonthlySupport2;
	private String MonthlySupport3;
	private String PDI_Val;
	private String PatternChannel;
	private String TradeStageValue;
	private String TrendAdvisor;
	private String WeeklyPivot;
	private String WeeklyResistance1;
	private String WeeklyResistance2;
	private String WeeklyResistance3;
	private String WeeklySupport1;
	private String WeeklySupport2;
	private String WeeklySupport3;
	private String LastTrend;
	private String AverageTruePriceRange;
	private String PriceReverseValue;
	private String ClosePrice;
	private String SDate;
	private String EMA_9;
	private String LongEMA_52;
	private String MidEMA_20;
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
	 * @return the gMMA
	 */
	public String getGMMA() {
		return GMMA;
	}
	/**
	 * @param gMMA the gMMA to set
	 */
	public void setGMMA(String gMMA) {
		GMMA = gMMA;
	}
	/**
	 * @return the aDX_DMI
	 */
	public String getADX_DMI() {
		return ADX_DMI;
	}
	/**
	 * @param aDX_DMI the aDX_DMI to set
	 */
	public void setADX_DMI(String aDX_DMI) {
		ADX_DMI = aDX_DMI;
	}
	/**
	 * @return the trendLine
	 */
	public String getTrendLine() {
		return TrendLine;
	}
	/**
	 * @param trendLine the trendLine to set
	 */
	public void setTrendLine(String trendLine) {
		TrendLine = trendLine;
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
	 * @return the swing
	 */
	public String getSwing() {
		return Swing;
	}
	/**
	 * @param swing the swing to set
	 */
	public void setSwing(String swing) {
		Swing = swing;
	}
	/**
	 * @return the fiboBuySell
	 */
	public String getFiboBuySell() {
		return FiboBuySell;
	}
	/**
	 * @param fiboBuySell the fiboBuySell to set
	 */
	public void setFiboBuySell(String fiboBuySell) {
		FiboBuySell = fiboBuySell;
	}
	/**
	 * @return the fiboPriceatTrigger
	 */
	public String getFiboPriceatTrigger() {
		return FiboPriceatTrigger;
	}
	/**
	 * @param fiboPriceatTrigger the fiboPriceatTrigger to set
	 */
	public void setFiboPriceatTrigger(String fiboPriceatTrigger) {
		FiboPriceatTrigger = fiboPriceatTrigger;
	}
	/**
	 * @return the fiboStopLoss
	 */
	public String getFiboStopLoss() {
		return FiboStopLoss;
	}
	/**
	 * @param fiboStopLoss the fiboStopLoss to set
	 */
	public void setFiboStopLoss(String fiboStopLoss) {
		FiboStopLoss = fiboStopLoss;
	}
	/**
	 * @return the fiboFirstTarget
	 */
	public String getFiboFirstTarget() {
		return FiboFirstTarget;
	}
	/**
	 * @param fiboFirstTarget the fiboFirstTarget to set
	 */
	public void setFiboFirstTarget(String fiboFirstTarget) {
		FiboFirstTarget = fiboFirstTarget;
	}
	/**
	 * @return the fiboSecondTarget
	 */
	public String getFiboSecondTarget() {
		return FiboSecondTarget;
	}
	/**
	 * @param fiboSecondTarget the fiboSecondTarget to set
	 */
	public void setFiboSecondTarget(String fiboSecondTarget) {
		FiboSecondTarget = fiboSecondTarget;
	}
	/**
	 * @return the performanceCheckSignal
	 */
	public String getPerformanceCheckSignal() {
		return PerformanceCheckSignal;
	}
	/**
	 * @param performanceCheckSignal the performanceCheckSignal to set
	 */
	public void setPerformanceCheckSignal(String performanceCheckSignal) {
		PerformanceCheckSignal = performanceCheckSignal;
	}
	/**
	 * @return the appelROCSignal
	 */
	public String getAppelROCSignal() {
		return AppelROCSignal;
	}
	/**
	 * @param appelROCSignal the appelROCSignal to set
	 */
	public void setAppelROCSignal(String appelROCSignal) {
		AppelROCSignal = appelROCSignal;
	}
	/**
	 * @return the volumeOscillatorSignal
	 */
	public String getVolumeOscillatorSignal() {
		return VolumeOscillatorSignal;
	}
	/**
	 * @param volumeOscillatorSignal the volumeOscillatorSignal to set
	 */
	public void setVolumeOscillatorSignal(String volumeOscillatorSignal) {
		VolumeOscillatorSignal = volumeOscillatorSignal;
	}
	/**
	 * @return the gordonRoseSignal
	 */
	public String getGordonRoseSignal() {
		return GordonRoseSignal;
	}
	/**
	 * @param gordonRoseSignal the gordonRoseSignal to set
	 */
	public void setGordonRoseSignal(String gordonRoseSignal) {
		GordonRoseSignal = gordonRoseSignal;
	}
	/**
	 * @return the rSIValue
	 */
	public String getRSIValue() {
		return RSIValue;
	}
	/**
	 * @param rSIValue the rSIValue to set
	 */
	public void setRSIValue(String rSIValue) {
		RSIValue = rSIValue;
	}
	/**
	 * @return the volumeAdverseRatio
	 */
	public String getVolumeAdverseRatio() {
		return VolumeAdverseRatio;
	}
	/**
	 * @param volumeAdverseRatio the volumeAdverseRatio to set
	 */
	public void setVolumeAdverseRatio(String volumeAdverseRatio) {
		VolumeAdverseRatio = volumeAdverseRatio;
	}
	/**
	 * @return the mACDSignal
	 */
	public String getMACDSignal() {
		return MACDSignal;
	}
	/**
	 * @param mACDSignal the mACDSignal to set
	 */
	public void setMACDSignal(String mACDSignal) {
		MACDSignal = mACDSignal;
	}
	/**
	 * @return the tLColSignal
	 */
	public String getTLColSignal() {
		return TLColSignal;
	}
	/**
	 * @param tLColSignal the tLColSignal to set
	 */
	public void setTLColSignal(String tLColSignal) {
		TLColSignal = tLColSignal;
	}
	/**
	 * @return the magicalTrendIndicatorUpdate
	 */
	public String getMagicalTrendIndicatorUpdate() {
		return MagicalTrendIndicatorUpdate;
	}
	/**
	 * @param magicalTrendIndicatorUpdate the magicalTrendIndicatorUpdate to set
	 */
	public void setMagicalTrendIndicatorUpdate(String magicalTrendIndicatorUpdate) {
		MagicalTrendIndicatorUpdate = magicalTrendIndicatorUpdate;
	}
	/**
	 * @return the mACDBlack
	 */
	public String getMACDBlack() {
		return MACDBlack;
	}
	/**
	 * @param mACDBlack the mACDBlack to set
	 */
	public void setMACDBlack(String mACDBlack) {
		MACDBlack = mACDBlack;
	}
	/**
	 * @return the gordonRoseIndicator
	 */
	public String getGordonRoseIndicator() {
		return GordonRoseIndicator;
	}
	/**
	 * @param gordonRoseIndicator the gordonRoseIndicator to set
	 */
	public void setGordonRoseIndicator(String gordonRoseIndicator) {
		GordonRoseIndicator = gordonRoseIndicator;
	}
	/**
	 * @return the buySellSignal
	 */
	public String getBuySellSignal() {
		return BuySellSignal;
	}
	/**
	 * @param buySellSignal the buySellSignal to set
	 */
	public void setBuySellSignal(String buySellSignal) {
		BuySellSignal = buySellSignal;
	}
	/**
	 * @return the dailyAverageBearVol
	 */
	public String getDailyAverageBearVol() {
		return DailyAverageBearVol;
	}
	/**
	 * @param dailyAverageBearVol the dailyAverageBearVol to set
	 */
	public void setDailyAverageBearVol(String dailyAverageBearVol) {
		DailyAverageBearVol = dailyAverageBearVol;
	}
	/**
	 * @return the dailyAverageBullVol
	 */
	public String getDailyAverageBullVol() {
		return DailyAverageBullVol;
	}
	/**
	 * @param dailyAverageBullVol the dailyAverageBullVol to set
	 */
	public void setDailyAverageBullVol(String dailyAverageBullVol) {
		DailyAverageBullVol = dailyAverageBullVol;
	}
	/**
	 * @return the dailyPivot
	 */
	public String getDailyPivot() {
		return DailyPivot;
	}
	/**
	 * @param dailyPivot the dailyPivot to set
	 */
	public void setDailyPivot(String dailyPivot) {
		DailyPivot = dailyPivot;
	}
	/**
	 * @return the dailyResistance1
	 */
	public String getDailyResistance1() {
		return DailyResistance1;
	}
	/**
	 * @param dailyResistance1 the dailyResistance1 to set
	 */
	public void setDailyResistance1(String dailyResistance1) {
		DailyResistance1 = dailyResistance1;
	}
	/**
	 * @return the dailyResistance2
	 */
	public String getDailyResistance2() {
		return DailyResistance2;
	}
	/**
	 * @param dailyResistance2 the dailyResistance2 to set
	 */
	public void setDailyResistance2(String dailyResistance2) {
		DailyResistance2 = dailyResistance2;
	}
	/**
	 * @return the dailyResistance3
	 */
	public String getDailyResistance3() {
		return DailyResistance3;
	}
	/**
	 * @param dailyResistance3 the dailyResistance3 to set
	 */
	public void setDailyResistance3(String dailyResistance3) {
		DailyResistance3 = dailyResistance3;
	}
	/**
	 * @return the dailySupport1
	 */
	public String getDailySupport1() {
		return DailySupport1;
	}
	/**
	 * @param dailySupport1 the dailySupport1 to set
	 */
	public void setDailySupport1(String dailySupport1) {
		DailySupport1 = dailySupport1;
	}
	/**
	 * @return the dailySupport2
	 */
	public String getDailySupport2() {
		return DailySupport2;
	}
	/**
	 * @param dailySupport2 the dailySupport2 to set
	 */
	public void setDailySupport2(String dailySupport2) {
		DailySupport2 = dailySupport2;
	}
	/**
	 * @return the dailySupport3
	 */
	public String getDailySupport3() {
		return DailySupport3;
	}
	/**
	 * @param dailySupport3 the dailySupport3 to set
	 */
	public void setDailySupport3(String dailySupport3) {
		DailySupport3 = dailySupport3;
	}
	/**
	 * @return the definite
	 */
	public String getDefinite() {
		return Definite;
	}
	/**
	 * @param definite the definite to set
	 */
	public void setDefinite(String definite) {
		Definite = definite;
	}
	/**
	 * @return the hH
	 */
	public String getHH() {
		return HH;
	}
	/**
	 * @param hH the hH to set
	 */
	public void setHH(String hH) {
		HH = hH;
	}
	/**
	 * @return the hL
	 */
	public String getHL() {
		return HL;
	}
	/**
	 * @param hL the hL to set
	 */
	public void setHL(String hL) {
		HL = hL;
	}
	/**
	 * @return the lH
	 */
	public String getLH() {
		return LH;
	}
	/**
	 * @param lH the lH to set
	 */
	public void setLH(String lH) {
		LH = lH;
	}
	/**
	 * @return the lL
	 */
	public String getLL() {
		return LL;
	}
	/**
	 * @param lL the lL to set
	 */
	public void setLL(String lL) {
		LL = lL;
	}
	/**
	 * @return the longMA_100
	 */
	public String getLongMA_100() {
		return LongMA_100;
	}
	/**
	 * @param longMA_100 the longMA_100 to set
	 */
	public void setLongMA_100(String longMA_100) {
		LongMA_100 = longMA_100;
	}
	/**
	 * @return the mA_5
	 */
	public String getMA_5() {
		return MA_5;
	}
	/**
	 * @param mA_5 the mA_5 to set
	 */
	public void setMA_5(String mA_5) {
		MA_5 = mA_5;
	}
	/**
	 * @return the midMA_45
	 */
	public String getMidMA_45() {
		return MidMA_45;
	}
	/**
	 * @param midMA_45 the midMA_45 to set
	 */
	public void setMidMA_45(String midMA_45) {
		MidMA_45 = midMA_45;
	}
	/**
	 * @return the monthlyPivot
	 */
	public String getMonthlyPivot() {
		return MonthlyPivot;
	}
	/**
	 * @param monthlyPivot the monthlyPivot to set
	 */
	public void setMonthlyPivot(String monthlyPivot) {
		MonthlyPivot = monthlyPivot;
	}
	/**
	 * @return the monthlyResistance1
	 */
	public String getMonthlyResistance1() {
		return MonthlyResistance1;
	}
	/**
	 * @param monthlyResistance1 the monthlyResistance1 to set
	 */
	public void setMonthlyResistance1(String monthlyResistance1) {
		MonthlyResistance1 = monthlyResistance1;
	}
	/**
	 * @return the monthlyResistance2
	 */
	public String getMonthlyResistance2() {
		return MonthlyResistance2;
	}
	/**
	 * @param monthlyResistance2 the monthlyResistance2 to set
	 */
	public void setMonthlyResistance2(String monthlyResistance2) {
		MonthlyResistance2 = monthlyResistance2;
	}
	/**
	 * @return the monthlyResistance3
	 */
	public String getMonthlyResistance3() {
		return MonthlyResistance3;
	}
	/**
	 * @param monthlyResistance3 the monthlyResistance3 to set
	 */
	public void setMonthlyResistance3(String monthlyResistance3) {
		MonthlyResistance3 = monthlyResistance3;
	}
	/**
	 * @return the monthlySupport1
	 */
	public String getMonthlySupport1() {
		return MonthlySupport1;
	}
	/**
	 * @param monthlySupport1 the monthlySupport1 to set
	 */
	public void setMonthlySupport1(String monthlySupport1) {
		MonthlySupport1 = monthlySupport1;
	}
	/**
	 * @return the monthlySupport2
	 */
	public String getMonthlySupport2() {
		return MonthlySupport2;
	}
	/**
	 * @param monthlySupport2 the monthlySupport2 to set
	 */
	public void setMonthlySupport2(String monthlySupport2) {
		MonthlySupport2 = monthlySupport2;
	}
	/**
	 * @return the monthlySupport3
	 */
	public String getMonthlySupport3() {
		return MonthlySupport3;
	}
	/**
	 * @param monthlySupport3 the monthlySupport3 to set
	 */
	public void setMonthlySupport3(String monthlySupport3) {
		MonthlySupport3 = monthlySupport3;
	}
	/**
	 * @return the pDI_Val
	 */
	public String getPDI_Val() {
		return PDI_Val;
	}
	/**
	 * @param pDI_Val the pDI_Val to set
	 */
	public void setPDI_Val(String pDI_Val) {
		PDI_Val = pDI_Val;
	}
	/**
	 * @return the patternChannel
	 */
	public String getPatternChannel() {
		return PatternChannel;
	}
	/**
	 * @param patternChannel the patternChannel to set
	 */
	public void setPatternChannel(String patternChannel) {
		PatternChannel = patternChannel;
	}
	/**
	 * @return the tradeStageValue
	 */
	public String getTradeStageValue() {
		return TradeStageValue;
	}
	/**
	 * @param tradeStageValue the tradeStageValue to set
	 */
	public void setTradeStageValue(String tradeStageValue) {
		TradeStageValue = tradeStageValue;
	}
	/**
	 * @return the trendAdvisor
	 */
	public String getTrendAdvisor() {
		return TrendAdvisor;
	}
	/**
	 * @param trendAdvisor the trendAdvisor to set
	 */
	public void setTrendAdvisor(String trendAdvisor) {
		TrendAdvisor = trendAdvisor;
	}
	/**
	 * @return the weeklyPivot
	 */
	public String getWeeklyPivot() {
		return WeeklyPivot;
	}
	/**
	 * @param weeklyPivot the weeklyPivot to set
	 */
	public void setWeeklyPivot(String weeklyPivot) {
		WeeklyPivot = weeklyPivot;
	}
	/**
	 * @return the weeklyResistance1
	 */
	public String getWeeklyResistance1() {
		return WeeklyResistance1;
	}
	/**
	 * @param weeklyResistance1 the weeklyResistance1 to set
	 */
	public void setWeeklyResistance1(String weeklyResistance1) {
		WeeklyResistance1 = weeklyResistance1;
	}
	/**
	 * @return the weeklyResistance2
	 */
	public String getWeeklyResistance2() {
		return WeeklyResistance2;
	}
	/**
	 * @param weeklyResistance2 the weeklyResistance2 to set
	 */
	public void setWeeklyResistance2(String weeklyResistance2) {
		WeeklyResistance2 = weeklyResistance2;
	}
	/**
	 * @return the weeklyResistance3
	 */
	public String getWeeklyResistance3() {
		return WeeklyResistance3;
	}
	/**
	 * @param weeklyResistance3 the weeklyResistance3 to set
	 */
	public void setWeeklyResistance3(String weeklyResistance3) {
		WeeklyResistance3 = weeklyResistance3;
	}
	/**
	 * @return the weeklySupport1
	 */
	public String getWeeklySupport1() {
		return WeeklySupport1;
	}
	/**
	 * @param weeklySupport1 the weeklySupport1 to set
	 */
	public void setWeeklySupport1(String weeklySupport1) {
		WeeklySupport1 = weeklySupport1;
	}
	/**
	 * @return the weeklySupport2
	 */
	public String getWeeklySupport2() {
		return WeeklySupport2;
	}
	/**
	 * @param weeklySupport2 the weeklySupport2 to set
	 */
	public void setWeeklySupport2(String weeklySupport2) {
		WeeklySupport2 = weeklySupport2;
	}
	/**
	 * @return the weeklySupport3
	 */
	public String getWeeklySupport3() {
		return WeeklySupport3;
	}
	/**
	 * @param weeklySupport3 the weeklySupport3 to set
	 */
	public void setWeeklySupport3(String weeklySupport3) {
		WeeklySupport3 = weeklySupport3;
	}
	/**
	 * @return the lastTrend
	 */
	public String getLastTrend() {
		return LastTrend;
	}
	/**
	 * @param lastTrend the lastTrend to set
	 */
	public void setLastTrend(String lastTrend) {
		LastTrend = lastTrend;
	}
	/**
	 * @return the averageTruePriceRange
	 */
	public String getAverageTruePriceRange() {
		return AverageTruePriceRange;
	}
	/**
	 * @param averageTruePriceRange the averageTruePriceRange to set
	 */
	public void setAverageTruePriceRange(String averageTruePriceRange) {
		AverageTruePriceRange = averageTruePriceRange;
	}
	/**
	 * @return the priceReverseValue
	 */
	public String getPriceReverseValue() {
		return PriceReverseValue;
	}
	/**
	 * @param priceReverseValue the priceReverseValue to set
	 */
	public void setPriceReverseValue(String priceReverseValue) {
		PriceReverseValue = priceReverseValue;
	}
	/**
	 * @return the closePrice
	 */
	public String getClosePrice() {
		return ClosePrice;
	}
	/**
	 * @param closePrice the closePrice to set
	 */
	public void setClosePrice(String closePrice) {
		ClosePrice = closePrice;
	}
	/**
	 * @return the sDate
	 */
	public String getSDate() {
		return SDate;
	}
	/**
	 * @param sDate the sDate to set
	 */
	public void setSDate(String sDate) {
		SDate = sDate;
	}
	/**
	 * @return the eMA_9
	 */
	public String getEMA_9() {
		return EMA_9;
	}
	/**
	 * @param eMA_9 the eMA_9 to set
	 */
	public void setEMA_9(String eMA_9) {
		EMA_9 = eMA_9;
	}
	/**
	 * @return the longEMA_52
	 */
	public String getLongEMA_52() {
		return LongEMA_52;
	}
	/**
	 * @param longEMA_52 the longEMA_52 to set
	 */
	public void setLongEMA_52(String longEMA_52) {
		LongEMA_52 = longEMA_52;
	}
	/**
	 * @return the midEMA_20
	 */
	public String getMidEMA_20() {
		return MidEMA_20;
	}
	/**
	 * @param midEMA_20 the midEMA_20 to set
	 */
	public void setMidEMA_20(String midEMA_20) {
		MidEMA_20 = midEMA_20;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EquityShares [id=" + id + ", " + (Symbol != null ? "Symbol=" + Symbol + ", " : "")
				+ (GMMA != null ? "GMMA=" + GMMA + ", " : "") + (ADX_DMI != null ? "ADX_DMI=" + ADX_DMI + ", " : "")
				+ (TrendLine != null ? "TrendLine=" + TrendLine + ", " : "")
				+ (BuySell != null ? "BuySell=" + BuySell + ", " : "") + (Swing != null ? "Swing=" + Swing + ", " : "")
				+ (FiboBuySell != null ? "FiboBuySell=" + FiboBuySell + ", " : "")
				+ (FiboPriceatTrigger != null ? "FiboPriceatTrigger=" + FiboPriceatTrigger + ", " : "")
				+ (FiboStopLoss != null ? "FiboStopLoss=" + FiboStopLoss + ", " : "")
				+ (FiboFirstTarget != null ? "FiboFirstTarget=" + FiboFirstTarget + ", " : "")
				+ (FiboSecondTarget != null ? "FiboSecondTarget=" + FiboSecondTarget + ", " : "")
				+ (PerformanceCheckSignal != null ? "PerformanceCheckSignal=" + PerformanceCheckSignal + ", " : "")
				+ (AppelROCSignal != null ? "AppelROCSignal=" + AppelROCSignal + ", " : "")
				+ (VolumeOscillatorSignal != null ? "VolumeOscillatorSignal=" + VolumeOscillatorSignal + ", " : "")
				+ (GordonRoseSignal != null ? "GordonRoseSignal=" + GordonRoseSignal + ", " : "")
				+ (RSIValue != null ? "RSIValue=" + RSIValue + ", " : "")
				+ (VolumeAdverseRatio != null ? "VolumeAdverseRatio=" + VolumeAdverseRatio + ", " : "")
				+ (MACDSignal != null ? "MACDSignal=" + MACDSignal + ", " : "")
				+ (TLColSignal != null ? "TLColSignal=" + TLColSignal + ", " : "")
				+ (MagicalTrendIndicatorUpdate != null
						? "MagicalTrendIndicatorUpdate=" + MagicalTrendIndicatorUpdate + ", "
						: "")
				+ (MACDBlack != null ? "MACDBlack=" + MACDBlack + ", " : "")
				+ (GordonRoseIndicator != null ? "GordonRoseIndicator=" + GordonRoseIndicator + ", " : "")
				+ (BuySellSignal != null ? "BuySellSignal=" + BuySellSignal + ", " : "")
				+ (DailyAverageBearVol != null ? "DailyAverageBearVol=" + DailyAverageBearVol + ", " : "")
				+ (DailyAverageBullVol != null ? "DailyAverageBullVol=" + DailyAverageBullVol + ", " : "")
				+ (DailyPivot != null ? "DailyPivot=" + DailyPivot + ", " : "")
				+ (DailyResistance1 != null ? "DailyResistance1=" + DailyResistance1 + ", " : "")
				+ (DailyResistance2 != null ? "DailyResistance2=" + DailyResistance2 + ", " : "")
				+ (DailyResistance3 != null ? "DailyResistance3=" + DailyResistance3 + ", " : "")
				+ (DailySupport1 != null ? "DailySupport1=" + DailySupport1 + ", " : "")
				+ (DailySupport2 != null ? "DailySupport2=" + DailySupport2 + ", " : "")
				+ (DailySupport3 != null ? "DailySupport3=" + DailySupport3 + ", " : "")
				+ (Definite != null ? "Definite=" + Definite + ", " : "") + (HH != null ? "HH=" + HH + ", " : "")
				+ (HL != null ? "HL=" + HL + ", " : "") + (LH != null ? "LH=" + LH + ", " : "")
				+ (LL != null ? "LL=" + LL + ", " : "") + (LongMA_100 != null ? "LongMA_100=" + LongMA_100 + ", " : "")
				+ (MA_5 != null ? "MA_5=" + MA_5 + ", " : "") + (MidMA_45 != null ? "MidMA_45=" + MidMA_45 + ", " : "")
				+ (MonthlyPivot != null ? "MonthlyPivot=" + MonthlyPivot + ", " : "")
				+ (MonthlyResistance1 != null ? "MonthlyResistance1=" + MonthlyResistance1 + ", " : "")
				+ (MonthlyResistance2 != null ? "MonthlyResistance2=" + MonthlyResistance2 + ", " : "")
				+ (MonthlyResistance3 != null ? "MonthlyResistance3=" + MonthlyResistance3 + ", " : "")
				+ (MonthlySupport1 != null ? "MonthlySupport1=" + MonthlySupport1 + ", " : "")
				+ (MonthlySupport2 != null ? "MonthlySupport2=" + MonthlySupport2 + ", " : "")
				+ (MonthlySupport3 != null ? "MonthlySupport3=" + MonthlySupport3 + ", " : "")
				+ (PDI_Val != null ? "PDI_Val=" + PDI_Val + ", " : "")
				+ (PatternChannel != null ? "PatternChannel=" + PatternChannel + ", " : "")
				+ (TradeStageValue != null ? "TradeStageValue=" + TradeStageValue + ", " : "")
				+ (TrendAdvisor != null ? "TrendAdvisor=" + TrendAdvisor + ", " : "")
				+ (WeeklyPivot != null ? "WeeklyPivot=" + WeeklyPivot + ", " : "")
				+ (WeeklyResistance1 != null ? "WeeklyResistance1=" + WeeklyResistance1 + ", " : "")
				+ (WeeklyResistance2 != null ? "WeeklyResistance2=" + WeeklyResistance2 + ", " : "")
				+ (WeeklyResistance3 != null ? "WeeklyResistance3=" + WeeklyResistance3 + ", " : "")
				+ (WeeklySupport1 != null ? "WeeklySupport1=" + WeeklySupport1 + ", " : "")
				+ (WeeklySupport2 != null ? "WeeklySupport2=" + WeeklySupport2 + ", " : "")
				+ (WeeklySupport3 != null ? "WeeklySupport3=" + WeeklySupport3 + ", " : "")
				+ (LastTrend != null ? "LastTrend=" + LastTrend + ", " : "")
				+ (AverageTruePriceRange != null ? "AverageTruePriceRange=" + AverageTruePriceRange + ", " : "")
				+ (PriceReverseValue != null ? "PriceReverseValue=" + PriceReverseValue + ", " : "")
				+ (ClosePrice != null ? "ClosePrice=" + ClosePrice + ", " : "")
				+ (SDate != null ? "SDate=" + SDate + ", " : "") + (EMA_9 != null ? "EMA_9=" + EMA_9 + ", " : "")
				+ (LongEMA_52 != null ? "LongEMA_52=" + LongEMA_52 + ", " : "")
				+ (MidEMA_20 != null ? "MidEMA_20=" + MidEMA_20 : "") + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		String Symbol= this.Symbol+" "+TLColSignal;
//		if(TLColSignal.equalsIgnoreCase(Definite))
//			if(Symbol!=null) return Symbol;
//		return null;
//	}
//	
	
	
	
	

}
