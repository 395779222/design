/**   
* @Title: sss.java
* @Package com.oz.decorator.test
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年4月1日 上午10:21:55
* @version V1.0   
*/


package com.oz.decorator.test;

/**
* @ClassName: sss
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年4月1日 上午10:21:55
* 
*/

public class Son extends Parent {  
    private int sn=3;  
    private static int sm=3;  
    static {  
        m = m + 2;  
        sm=sm+2;  
        System.out.println("子类静态块调用；    m="+m);  
    }  
    {  
        n = n + 2;  
        sn=sn+2;  
        m = m + 2;  
        System.out.println("子类普通块调用；");  
        System.out.print("n="+n);  
        System.out.print("sn="+sn);  
        System.out.println("    m="+m);  
    }  
  
    public Son() {  
    	//super();
        this.n = n + 10;  
        sn=sn+10;  
        m = m + 10;  
        System.out.print("子类构造子；n="+n);  
        System.out.println("    m="+m);  
    }  
    
    public static void main(String[] args) {
		new Son();
	}
}  