package com.oz.adapter;

import java.util.ArrayList;
import java.util.List;
/*
 * 这个适配器模式 是把源 聚合到适配器类中
 * 还有一种适配器模式 不是聚合，而是通过继承源的形式实现的课自行学习
 * 这里是一个影片列表适配器
 * */
public class MovieAdapter implements Target{
	
	List<Movie>movieList = new ArrayList<Movie>();
	List<View>viewHolder = new ArrayList<View>();
	
	public MovieAdapter(List<Movie>movieList){
		this.movieList = movieList;
	}
	
	public int getCount() {
		System.out.println("安卓客户端将要展示的影片数量："+movieList.size());
		return movieList.size();
	}

	public void getView(int positon, View convertView) {
		//这里就是操作movieList，将movieList =>view
		//positon : movieList 的位置
		//convertView : 就是相当于安卓手机中的展示区所对应的对象，这里只要把影片名称，图片塞进去即可
		System.out.println("安卓客户端将movieList装换成安卓识别的view对象");
		
	}

	public void show() {
		getCount();
		getView(1,null);
		//实际安卓开发中这里可以调用getView，getCount()等一系列操作
		System.out.println("安卓客户端开始展示影片列表了");
	}
}
