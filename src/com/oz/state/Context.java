package com.oz.state;

public class Context {
	
	private State state;
	
	public void sentMsg(String stateString){
		
		if(stateString.equals("锁坐成功")){
			state = new LocakSuccess();
		}
		
		else if(stateString.equals("售票成功")){
			state = new SellSuccess();
		}
		state.setMsg();
	}
}
