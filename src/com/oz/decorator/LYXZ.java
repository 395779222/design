package com.oz.decorator;

public class LYXZ {
	
	/*
	 * 装饰模式可以动态的给对象增加一些功能，不需要修改原有的类
	 * 只要增加装饰类即可
	 * */
	public static void main(String[] args) {
		//初级程序员  装饰
		Coder primaryCoder = new PrimaryCoder();
		primaryCoder = new Improve(primaryCoder);// 生成Improve对象，包含，该对象的变量为 primaryCoder()
		primaryCoder = new Teach(primaryCoder);//生成Teach对象，该对象包含 Improve对象，是一整列循环系类
		primaryCoder.doCoding();//会调用 Teach的doCoding-》调用 ImprovedoCoding->primaryCoder的doCOding
		
//		Coder highCoder = new HighCoder();
//		highCoder = new Teach(highCoder);
//		highCoder.doCoding();
		
	}
}
