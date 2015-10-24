package com.oz.factory.method;

import com.oz.factory.simple.MovieService;
/*
 * 工厂方法模式
 * */
public interface Factory {
	
	public  MovieService getMovieService();
}
