package com.oz.decorator;

public abstract class CoderDecorator implements Coder{
	private Coder coder;
	
	
	public CoderDecorator(Coder coder){
		System.out.println("装饰父类构造");
		this.coder = coder;
		
	}
	
	
	
	public Coder getCoder() {
		return coder;
	}



	public void setCoder(Coder coder) {
		this.coder = coder;
	}



	public abstract void doCoding();
}
