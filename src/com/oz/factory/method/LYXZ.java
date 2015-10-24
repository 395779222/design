package com.oz.factory.method;


import com.oz.factory.simple.MovieService;

public class LYXZ {
	public static void main(String[] args) {
		Factory dsnFactory = new DSNFactory();
		MovieService dsnService = dsnFactory.getMovieService();
	
		dsnService.getCinema();
		dsnService.getCinemaSechedule(1);
		dsnService.getCinemaHall(1);
		dsnService.getSeatList(1);
		
		Factory zyFactory = new ZYFactory();
		MovieService zyService = zyFactory.getMovieService();
		
		zyService.getCinema();
		zyService.getCinemaSechedule(2);
		zyService.getCinemaHall(2);
		zyService.getSeatList(2);
		
		/*
		 * 我是DSN提供商的经纪人，正在创建实例
			我是迪斯尼提供的影院：程序员专属影院
			我是迪斯尼提供的场次：程序员专属影院 超人陆战队 2015-05-20 12:00:00
			我是迪斯尼提供的影厅：程序员专属影院 2号厅
			我是迪斯尼提供的座位： 超人陆战队 2015-05-20 12:00:00 5排2座
			我是ZY提供商的经纪人，正在创建实例
			我是中影提供的影院：超人影院
			我是中影提供的场次：复仇者联盟2015-05-20 16:00:00
			我是中影提供的影厅：超人影院一号厅
			我是中影提供的座位：复仇者联盟2015-05-20 16:00:00 5排一座 。。。。。
		 * */
	}
	
}
