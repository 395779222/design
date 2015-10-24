package com.oz.factory.simple;


/*
 * 迪斯尼购票信息提供商
 * */
public class DSN implements MovieService{

	public void getCinema() {
		System.out.println("我是迪斯尼提供的影院：程序员专属影院");
		
	}

	public void getCinemaSechedule(long cienamId) {
		System.out.println("我是迪斯尼提供的场次：程序员专属影院 超人陆战队 2015-05-20 12:00:00");
		
	}

	public void getCinemaHall(long cienamId) {
		System.out.println("我是迪斯尼提供的影厅：程序员专属影院 2号厅");
		
	}

	public void getSeatList(long scheduledId) {
		System.out.println("我是迪斯尼提供的座位： 超人陆战队 2015-05-20 12:00:00 5排2座");
		
	}

}
