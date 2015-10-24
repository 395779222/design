package com.oz.stratery;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	public void operate(){  
		this.strategy.dealSoldTickeFaild();  
	}  
}
