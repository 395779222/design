package com.oz.build;
/*
 * 我们购票网站想给一些比较火的影院做一些同卷（使用同卷可以免费兑换影票）
 * 这些同卷也是给我们的福利，我可以把它们送给朋友，吹NB也有资本了。
 * 这些同卷包可能包含，失效时间，支持的影院，支持的影片的，售卖的价格等
 * 同事呢我们的同卷也是多样化的，有的是一次性的，有的可以多次使用的，有的非常漂亮的，有情侣的等等。。。。
 * */
public class Eatg {
	
	//同卷封面
	private String cover;
	//同卷使用途径
	private String userWay;
	
	
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getUserWay() {
		return userWay;
	}
	public void setUserWay(String userWay) {
		this.userWay = userWay;
	}
	
	
	
}
