package com.oz.factory.method;

import com.oz.factory.simple.MovieService;
import com.oz.factory.simple.ZY;

public class ZYFactory implements Factory{

	public MovieService getMovieService() {
		System.out.println("我是ZY提供商的经纪人，正在创建实例");
		return new ZY();
	}

}
