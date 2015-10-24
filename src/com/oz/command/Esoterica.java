package com.oz.command;

/*
 * 这个男子的秘籍
 * */
public class Esoterica {
	private Command command;  
	    public void setCommand(Command command) {  
	        this.command = command;  
	    }  
	    public void execute(){  
	        this.command.execute();  
	 }  
}
