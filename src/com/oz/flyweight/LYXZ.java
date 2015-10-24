package com.oz.flyweight;

public class LYXZ {
	public static void main(String[] args) {
      
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory("语文","请求语文做的对象");
        fly.doHomeWork("语文");
        
        fly = factory.factory("数学","请求数学做的对象");
        fly.doHomeWork("数学");
        
        fly = factory.factory("英语","请求英语做的对象");
        fly.doHomeWork("英语");
        
        //按照亨元模式的特点当我们第二次去取数学作业的时候，不用再去做数学作业了（就是不用再去重新生成对象了）
        //应为钱面已经做过了，我们看看第二次去取数学作业的时候，取到的仍然是第一次的对象
        fly = factory.factory("数学","请求数学做的第二个对象");
        fly.doHomeWork("数学");
    }
	
	/* 
	 * 对面宿舍哥们向我们要作业语文
		我的名字是:请求语文做的对象
		我们做了语文
		
		对面宿舍哥们向我们要作业数学
		我的名字是:请求数学做的对象
		我们做了数学
		
		对面宿舍哥们向我们要作业英语
		我的名字是:请求英语做的对象
		我们做了英语
		
		对面宿舍哥们向我们要作业数学
		我的名字是:请求数学做的对象
		我们做了数学

	 * */
}
