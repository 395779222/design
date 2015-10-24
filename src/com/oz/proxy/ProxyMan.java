package com.oz.proxy;

public class ProxyMan implements LOLMan{

	private LOLMan lolMan;
	
	/*
	 * 找代理网游戏，一定要有用户名密码，淡然了钱已经付过了
	 * */
	public ProxyMan (String userName,String password){
	
		if(userName.equals("LYXZ")&&password.equals("LYXZ")){
			lolMan = new LYXZLOLMan();
		}
	}
	
	public void commonGame() {
		System.out.println("代理进入普通游戏");
		lolMan.commonGame();
		System.out.println("代理结束普通游戏");
	}

	public void Qualifying() {
		System.out.println("代理进入排位游戏");
		lolMan.Qualifying();
		System.out.println("代理结束排位游戏");
		
	}

}
