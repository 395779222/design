package com.oz.flyweight;

import java.util.HashMap;
import java.util.Map;
/*
 * 类似于spring beanfactory
 * 如果已经加载了 ，那么就要销毁，然后重新启动
 * 自己手动获取的时候，其实只需要加载一次，然后保存起来即可
 * */
public class FlyweightFactory {
private Map<String,Flyweight> files = new HashMap<String,Flyweight>();
    
    public Flyweight factory(String state,String name){
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state,name);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }
}
