package com.oz.build;

public class IMAXEatgBuilder implements Builder{
	Eatg eatg = new Eatg();
	
	public void buildCover() {
		eatg.setCover("我是IMAX同卷封面");
		
	}

	public void buildUserWay() {
		eatg.setUserWay("我可以兑换IMAX影票");
		
	}

	public Eatg getEatg() {
		
		return eatg;
	}

}
