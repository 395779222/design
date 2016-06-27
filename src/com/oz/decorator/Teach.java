package com.oz.decorator;

public class Teach extends CoderDecorator{

	public Teach(Coder coder) {
		super(coder);
		
		System.out.println("教育装饰构造");
	}
	
	public void teach(){
		System.out.println("正在给别人传播经验(装饰)");
	}
	
	@Override
	public void doCoding() {
		System.out.println("教育装饰coding");
		teach();
		this.getCoder().doCoding();
	}

}
