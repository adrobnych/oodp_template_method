package com.sysiq.stocks_faker;

public class StockHolder{
	String ticker;
	Integer quantity;
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public StockHolder() {
		
		ticker = "AAPL";
		quantity = 2505;
	}
}