package com.oz.flyweight;

public class ConcreteFlyweight implements Flyweight{
	//对象名称
	private String name;
	
	private String state;
	
	public ConcreteFlyweight(String state,String name){
		this.name = name;
		this.state = state;
	}

	public void doHomeWork(String state) {
		System.out.println("对面宿舍哥们向我们要作业"+state);
		System.out.println("我的名字是:"+name+"\n"+"我们做了"+this.state+"\n");
	}
}
