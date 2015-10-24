package com.oz.state;

/*
 * 策略模式 ，状态模式如此相似？
 * 策略模式客户端，需要知道自己使用哪个策略.
 * 状态模式客户端不需要知道自己属于什么状态,环境回个那句用户的操作来判断用户属于怎样的状态
 * 并且状态模式之中这些状态课意识相互转化的要考虑使用状态模式
 * */
public class LYXZ {
	public static void main(String[] args) {
		Context context = new Context();
		context.sentMsg("锁坐成功");
	
		context.sentMsg("售票成功");
	}
	
}
