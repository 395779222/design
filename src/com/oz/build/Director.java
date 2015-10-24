package com.oz.build;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void bulid(){
		builder.buildCover();
		builder.buildUserWay();
	}
}
