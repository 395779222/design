package com.oz.facade;

/*
 * 们门面模式 使得调用者 不需要关心太多细节问题，直接一步到位
 * 这样也使得一些流程不被client知道，也抱枕了一些安全问题
 * */
public class LYXZ {
	
	public static void main(String[] args) {
		Facade face = new Facade();
		face.watchFilm();
		System.out.print("现在你可以去看电影了");
	}
	
}
