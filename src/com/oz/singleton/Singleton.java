package com.oz.singleton;

public class Singleton {  
    //私有的默认构造子  
    private Singleton() {}  
    //注意，这里没有final      
    private static Singleton single=null;  
    //静态工厂方法   
    public static Singleton getInstance() {  
         if (single == null) {    
             single = new Singleton();  
         }    
        return single;  
    }  
}  