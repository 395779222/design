package com.oz.memento;

public class LYXZ {
	
	public static void main(String[] args) {
		
		FileInfo fileInfo = new FileInfo("我是小样米视频","2015-05-21 13:00:00");
		Cloude cloude = new Cloude();
		cloude.setFileMemento(fileInfo);
		
		//设置了一个备份
		Manager manager = new Manager();
		manager.setMemento(cloude.createMemento());
		
		//下午一个猥琐哥们给了我一个新的名曰高清，我于是上传了新的小杨幂视频
		FileInfo fileInfoNew = new FileInfo("我是小样米视频高清视频","2015-05-22 13:00:00");
		cloude.setFileMemento(fileInfoNew);
		
		//后来哥发现这个视频后面全是广告，哥又把视屏还原了
		cloude.restoreMemento(manager.getMemento());
		
		
		
		
	}
	
	
}
