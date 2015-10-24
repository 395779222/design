package com.oz.command;

public class BeautifulCommand implements Command{

	private Man man;  
    public BeautifulCommand(Man man){  
    	this.man = man;  
    }  
	    
	public void execute() {  
	   this.man.giveLoveToBeautiful();  
	}  

}
