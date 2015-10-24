package com.oz.flyweight;

/*
 * 亨元模式，与当例模式有点类似
 * 
 * 初中我们一个宿舍，由于作业太多，我们决定我们3个基友分别做语数外3门作业
 * 然后集中一下，就变成所有作业了，效率是不是变快了呀,如果其他宿舍某个哥么没做语文，拿他也不用做了
 * 应为我们有现成的答案啊
 * */
public interface Flyweight {
	
	//state ： 语数外 3个状态
    public void doHomeWork(String state);
}
