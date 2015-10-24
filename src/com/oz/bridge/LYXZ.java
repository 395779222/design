package com.oz.bridge;
/*
 * 将抽象和行为划分开来,各自独立,但能动态的结合。  
 * 与策略模式的区别就在于，执行的动作的对象是否是多个，若是多个那么就是桥梁模式，若是策略模式
 * 策略模式只保证了行为独立（当然啦，策略模式的主题也只是一个对象）
 * 
 * 
 * */
public class LYXZ {
	public static void main(String[] args) { 
		
		System.out.println("小哥我正在整理豪放派诗人的信息");
		AbstractPoet haoFangPoet = new HaoFangPoet();
		haoFangPoet.setPoetAction(new HaoFangPoetAction());
		haoFangPoet.writePoem();
		
		System.out.println("小哥我正在整理浪漫派诗人的信息");
		AbstractPoet lanManPoet = new LanManPoet();
		lanManPoet.setPoetAction(new LanManPoetAction());
		lanManPoet.writePoem();
		
    }  
}
