package com.oz.factory.simple;

/*中影购票信息提供商
 * */
public class ZY implements MovieService{

	public void getCinema() {
		System.out.println("我是中影提供的影院：超人影院");
		
	}

	public void getCinemaSechedule(long cienamId) {
		System.out.println("我是中影提供的场次：复仇者联盟2015-05-20 16:00:00");
		
	}

	public void getCinemaHall(long cienamId) {
		System.out.println("我是中影提供的影厅：超人影院一号厅");
		
	}

	public void getSeatList(long scheduledId) {
		System.out.println("我是中影提供的座位：复仇者联盟2015-05-20 16:00:00 5排一座 。。。。。");
		
	}

}
