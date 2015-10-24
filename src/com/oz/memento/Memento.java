package com.oz.memento;

/*
 * 备忘的角色色
 * */
public class Memento {
	
	private FileInfo fileInfo;

	public Memento(FileInfo fileInfo){
		this.fileInfo = fileInfo;
	}
	
	public Memento(String content, String time){
		this.fileInfo.setContent(content);
		this.fileInfo.setTime(time);
	}
	
	public FileInfo getFileInfo() {
		return fileInfo;
	}

	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	
	
	
}
