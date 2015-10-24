package com.oz.adapter;


/*
 * 领导下达命令给我们绿野仙踪狗骗平台开发客户端，现在问题出来了，我们怎么一系列的影片信息展示在客户端上呢
 * 从数据转换到页面 （安卓本身自带适配器,我这里只是做举例）
 * 其实也就是我们每条数据对应着页面的一个展示区
 * 那么适配器模式大显身手了
 * */
public interface Target {
	
	//获取一共多少个展示区域
	public int getCount();
	
	//这个view就是直接可以展示在安卓系统上的对象
	public void getView(int positon,View convertView);
	
	//调用就可以直接显示在客户端上了
	public void show();
	
	
}
