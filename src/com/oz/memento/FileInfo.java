package com.oz.memento;

public class FileInfo {
	
	String content ;
	String time;
	
	public FileInfo (String content,String time){
		this.content = content;
		this.time = time;
	}
	
	

	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	
	
	
}
