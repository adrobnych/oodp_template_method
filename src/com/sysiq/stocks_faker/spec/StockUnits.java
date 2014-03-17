package com.sysiq.stocks_faker.spec;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

import com.sysiq.stocks_faker.StockHolder;
import com.sysiq.stocks_faker.StocksPortfolioManager;

public class StockUnits {

	@Test
	public void testEvetyrhing() throws IOException {
		StocksPortfolioManager spm = new StocksPortfolioManager();
		Map<String, Integer> everything = spm.getStockTickerAndQuantity();
		assertEquals(39, everything.size());
		assertEquals(Integer.valueOf(2505), everything.get("AAPL"));
		assertEquals(Integer.valueOf(6478), everything.get("WMT"));
	}
	
	@Test
	public void testFirst() throws IOException {
		StocksPortfolioManager spm = new StocksPortfolioManager();
		StockHolder first = spm.getFirstStockTickerAndQuantity();
		assertEquals("AAPL", first.getTicker());
		assertEquals(Integer.valueOf(2505), first.getQuantity());
	}
	
	@Test
	public void testMax() throws IOException {
		StocksPortfolioManager spm = new StocksPortfolioManager();
		StockHolder max = spm.getMaxStockTickerAndQuantity();
		assertEquals("BAC", max.getTicker());
		assertEquals(Integer.valueOf(9839), max.getQuantity());
	}
	
	@Test
	public void testMin() throws IOException {
		StocksPortfolioManager spm = new StocksPortfolioManager();
		StockHolder min = spm.getMinStockTickerAndQuantity();
		assertEquals("PFE", min.getTicker());
		assertEquals(Integer.valueOf(659), min.getQuantity());
	}

}
