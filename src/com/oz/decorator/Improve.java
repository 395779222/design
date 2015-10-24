package com.oz.decorator;

public class Improve extends CoderDecorator{

	public Improve(Coder coder) {
		super(coder);
	}
	
	public void impove(){
		System.out.println("知识有限，正在提升技能(装饰)");
	}
	
	@Override
	public void doCoding() {
		impove();
		this.getCoder().doCoding();
		
	}
	
	
}
