package com.oz.prototype;

/*
 * 原型模式这里我就用用别人的例子觉得还是挺好的
 * */
public class Mail implements Cloneable{
	
//	private String content;
//	private String reciever;
//	private String subject;
	
	
	public Mail clone(){  
		Mail mail = null;  
        try{  
        	mail = (Mail)super.clone();  
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        return mail;   
    }  
}
