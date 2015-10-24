package com.oz.build;

public class LYXZ {
	
	/*
	 * 看到我们的建造者模式，看看director 的build方法是不是很像模板方法？
	 * 
	 * 工厂模式与建造者模式 主要区别在于 建造者模式有一个指导者类,没有工厂类，指导者里面还有对象的制造顺序，也就是核心区别
	 * */
	public static void main(String[] args) {
		
		//这不干干在路上遇到一对情侣，一看是小学同学顺便送了一张
		Builder loveBuilder = new LoveEatgBuilder();
		Director director = new Director(loveBuilder);
		director.bulid();
		Eatg loveEatg = loveBuilder.getEatg();
		System.out.println(loveEatg.getCover()+"    "+loveEatg.getUserWay());
		
		
		//送给老大的时候淡然就得imx
		Builder imaxBuilder = new IMAXEatgBuilder();
		Director director2 = new Director(imaxBuilder);
		director2.bulid();
		Eatg imaxEatg = imaxBuilder.getEatg();
		System.out.println(imaxEatg.getCover()+"    "+imaxEatg.getUserWay());
		
	}
	
}
