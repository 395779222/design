package com.oz.adapter;

import java.util.ArrayList;
import java.util.List;


/*
 * 用户：绿野仙踪
 * */
public class LYXZ {
	/*
	 * 适配模式使用与：
	 * 当我们将不兼容的类转化为可兼容
	 * 就像我们这个例子，影片列表，怎么样才能在Android显示在我们安卓设备上呢，通过适配器解决这个问题，
	 * 不需要改变原有代码的逻辑
	 * 
	 * */
	public static void main(String[] args) {
		List<Movie>movieList = new ArrayList<Movie>();
		Target movieAdapter = new MovieAdapter(movieList);
		movieAdapter.show();
		
	}
	
}
