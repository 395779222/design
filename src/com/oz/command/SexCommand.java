package com.oz.command;
/*
 * 性感的女朋友
 * */
public class SexCommand implements Command{
	
	private Man man;  
    public SexCommand(Man man){  
    	this.man = man;  
    }  
	    
	public void execute() {  
	   this.man.giveLoveToSex();  
	}  
	
	
}
