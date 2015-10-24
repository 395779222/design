package com.oz.memento;

/*
 * 现在云 发展速度很快，云端文件备份怎么实现？当然只要在替换某个文件之前把这个文件备份一下即可。
 * 问题是很多个呀，我们要知道备份文件的位置，备份的时间等等
 * 小白曾近做过广电的项目，其中一个发布网页流程（说白了就是发布一写文件），就会有撤销回复功能
 * */
public class Cloude {
	
	
	//云端发布的影片信息（要备份的角色）若想备份多个文件或是其他，这里可以使用list
	private FileInfo fileInfo;
	
	
	//创建备份
	public Memento createMemento(){
		return new Memento(fileInfo);  
	}
	
	//恢复
	public void restoreMemento(Memento memento){
		this.setFileMemento(memento.getFileInfo());
	}
	
	
	public FileInfo getFileMemento() {
		return fileInfo;
	}

	public void setFileMemento(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	
	
}
