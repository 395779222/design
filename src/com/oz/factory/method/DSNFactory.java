package com.oz.factory.method;

import com.oz.factory.simple.DSN;
import com.oz.factory.simple.MovieService;

public class DSNFactory implements Factory{

	public MovieService getMovieService() {
		System.out.println("我是DSN提供商的经纪人，正在创建实例");
		return new DSN();
	}

}
