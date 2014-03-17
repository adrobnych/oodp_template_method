package com.sysiq.stocks_faker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class StocksPortfolioManager {

	public Map<String, Integer> getStockTickerAndQuantity() throws IOException {
		FileReader fr = new FileReader("stocks.txt");
		final BufferedReader reader = new BufferedReader(fr);

		final Map<String, Integer> stocks = new HashMap<String, Integer>();

		String stockInfo = null;
		while((stockInfo = reader.readLine()) != null) {
			final String[] stockInfoData = stockInfo.split(",");
			final String stockTicker = stockInfoData[0];
			final Integer quantity = Integer.valueOf(stockInfoData[1]);

			stocks.put(stockTicker, quantity); 
		}
		fr.close();
		return stocks;    
	}
	
	public StockHolder getFirstStockTickerAndQuantity() throws IOException {
		FileReader fr = new FileReader("stocks.txt");
		final BufferedReader reader = new BufferedReader(fr);

		StockHolder sh = new StockHolder();

		String stockInfo = null;
		if((stockInfo = reader.readLine()) != null) {
			final String[] stockInfoData = stockInfo.split(",");
			final String stockTicker = stockInfoData[0];
			final Integer quantity = Integer.valueOf(stockInfoData[1]);


			sh.setQuantity(quantity);
			sh.setTicker(stockTicker);
		}
		fr.close();
		return sh;    
	}

	public StockHolder getMaxStockTickerAndQuantity() throws IOException {
		FileReader fr = new FileReader("stocks.txt");
		final BufferedReader reader = new BufferedReader(fr);

		StockHolder sh = new StockHolder();

		String stockInfo = null;
		while((stockInfo = reader.readLine()) != null) {
			final String[] stockInfoData = stockInfo.split(",");
			final String stockTicker = stockInfoData[0];
			final Integer quantity = Integer.valueOf(stockInfoData[1]);
			
			if(quantity > sh.getQuantity()){
				sh.setQuantity(quantity);
				sh.setTicker(stockTicker);
			}
		}
		fr.close();
		return sh;    
	}
	
	public StockHolder getMinStockTickerAndQuantity() throws IOException {
		FileReader fr = new FileReader("stocks.txt");
		final BufferedReader reader = new BufferedReader(fr);

		StockHolder sh = new StockHolder();

		String stockInfo = null;
		while((stockInfo = reader.readLine()) != null) {
			final String[] stockInfoData = stockInfo.split(",");
			final String stockTicker = stockInfoData[0];
			final Integer quantity = Integer.valueOf(stockInfoData[1]);
			
			if(quantity < sh.getQuantity()){
				sh.setQuantity(quantity);
				sh.setTicker(stockTicker);
			}
		}
		fr.close();
		return sh;    
	}

}
