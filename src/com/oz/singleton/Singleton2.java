package com.oz.singleton;

//饿汉式单例类.在类初始化时，已经自行实例化   线程是安全的推荐使用
public class Singleton2 {  
    //私有的默认构造子  
    private Singleton2() {}  
    //已经自行实例化   
    private static final Singleton2 single = new Singleton2();  
    //静态工厂方法   
    public static Singleton2 getInstance() {  
        return single;  
    }  
}  