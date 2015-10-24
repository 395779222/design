package com.oz.decorator;

public class Teach extends CoderDecorator{

	public Teach(Coder coder) {
		super(coder);
	}
	
	public void teach(){
		System.out.println("正在给别人传播经验(装饰)");
	}
	
	@Override
	public void doCoding() {
		teach();
		this.getCoder().doCoding();
	}

}
