package com.mmoce.stock;

public final class StockSingleton {
	private StockSingleton() {
		
	}
	private static Stock stk;
	
	public Stock getStock() {
		if(stk==null) {
			stk=new Stock();
			
		}
		return stk;
		
	}

}
