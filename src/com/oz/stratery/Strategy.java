package com.oz.stratery;

/*
 * 前面说到我们的绿野仙踪购票网站，说道购票有时候遇到这种肯跌情况，就是我付钱了，但是票没买成功，淡然啦原因很多，
 * 关键问题是我们正对这样的情况怎么处理呢？
 * */
public interface Strategy {
	
	public void dealSoldTickeFaild();
	
}
