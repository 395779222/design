package com.oz.facade;

/*
 * 为了版主一些土豪一步到位看电影服务，这不我就免费其难一步到位把买票支付取票豆瓣他做了
 * 当然了个要收取手续费的
 * 门面模式和中介者模式有类似地方
 * 
 * */
public class Facade {
	
	public void watchFilm(){
		Seat seat = new Seat();
		seat.chooseSeat();
		Pay pay = new Pay();
		pay.pay();
		Draw draw = new Draw();
		draw.draw();
	}
}
