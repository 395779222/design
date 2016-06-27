/**   
* @Title: wwww.java
* @Package com.oz.decorator.test
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年4月1日 上午10:21:29
* @version V1.0   
*/


package com.oz.decorator.test;

/**
* @ClassName: wwww
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年4月1日 上午10:21:29
* 
*/
public class Parent {  
    protected int n = 5;  
    protected static int m = 5;  
    static {  
        m = m * 2;  
        System.out.println("父类静态块调用；    m="+m);  
    }  
    {  
        n = n * 2;  
        m = m * 2;  
        System.out.print("父类普通块调用；");  
        System.out.print("n="+n);  
        System.out.println("    m="+m);  
    }  
  
    public Parent() {  
        this.n = n * 10;  
        m = m + 10;  
        System.out.print("父类构造子；    n="+n);  
        System.out.println("    m="+m);  
    }  
}  