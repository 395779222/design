package com.oz.decorator;

public class LYXZ {
	
	/*
	 * 装饰模式可以动态的给对象增加一些功能，不需要修改原有的类
	 * 只要增加装饰类即可
	 * */
	public static void main(String[] args) {
		//初级程序员  装饰
		Coder primaryCoder = new PrimaryCoder();
		primaryCoder = new Improve(primaryCoder);
		primaryCoder.doCoding();
		
		Coder highCoder = new HighCoder();
		highCoder = new Teach(highCoder);
		highCoder.doCoding();
		
	}
}
