package com.oz.bridge;

public class HaoFangPoet extends AbstractPoet{
	
	public  void writePoem(){
		System.out.println("我是豪放诗人，我天生就很豪放，诗更豪放，反正也是假的(我是对象，我要与行为分离)");
		super.writePoem();
	}
}
