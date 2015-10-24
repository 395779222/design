package com.oz.factory.simple;

/*
 * 工厂角色
 * */
public class Factory {
	
	public static MovieService getMovieService(String movieServiceName){
		try{
			//这里按照信息提供商的名称来进行组装，其他方亦可以
			if(movieServiceName.equals("ZY")){
				/*
				 * 这里直接返回一个提供商的实例，一般情况下，若有一些初始化信息也可以初始化
				 * 例如：你获取人家信息，需要告诉你是谁把。所以在movieService可以设置一下userName,key等信息
				 * 若初始化信息比较复杂，像spring初始化一些配置文件比较复杂，这里可以专门设置配置信息类
				 * 或者就是我们工厂模式中的工厂方法模式(其中具体工厂就相当于专门设置配置信息类);
				 * 
				 * */
				return new ZY();
			}
			else if(movieServiceName.equals("DSN")){
				return new DSN();
			}
			else{
				throw new NullMovieServiceException("no movieServiceName is supplied");
			}
		}catch(NullPointerException e){
			System.out.println("movieServiceName is null");
		}
		return null;
	}
}
