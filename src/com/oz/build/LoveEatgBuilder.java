package com.oz.build;

public class LoveEatgBuilder implements Builder{
	Eatg eatg = new Eatg();
	
	public void buildCover() {
		eatg.setCover("我是情侣同卷封面");
		
	}

	public void buildUserWay() {
		eatg.setUserWay("我可兑换情侣座");
		
	}

	public Eatg getEatg() {
		return eatg;
	}

}
