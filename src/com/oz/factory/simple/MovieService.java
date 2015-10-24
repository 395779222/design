package com.oz.factory.simple;

/**
 * @author hxy
 * 
 * 简单工厂模式
 * 以正常的电影网站购票为例
 * 一般购票网站的所有的场次信息，影院信息等这些信息不是他们本身就有的而是通过很多渠道去获取最后整合为自己一套信息
 * 
 */
public interface  MovieService {
	
	/*
	 * 获取影院信心
	 * */
	public void getCinema(); 
	
	/*获取排期信息
	 * */
	public void getCinemaSechedule(long cienamId); 
	
	/*获取影院的影厅信息
	 * */
	public void getCinemaHall(long cienamId); 
	
	/*获取排期的座位信息
	 * */
	public void getSeatList(long scheduledId); 


}
