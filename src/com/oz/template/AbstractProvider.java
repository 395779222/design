package com.oz.template;


/*
 * 工厂模式中说到了我们成立了绿野仙踪购票平台，这不咱变NB了好多客户端也来对接咱们的购票平台
 * 那么我就要给他数据呀，那怎么办呢写接口呗，虽然很多客户端咱也不偶
 * 咱先定义一个总的数据提供者
 * 做过接口的人都会知道，我做接口坑定要验证别人生分呀，参数呀等信息
 * 通过后才能最终去取数据给别人
 * */

public abstract class AbstractProvider {
	
	//验证用户名
	public abstract void vallidateUserName();
	
	//验证方法名
	public abstract void vallidateMethodName();
	
	//验证签名信息
	public abstract void vallidateSign();
	
	/*
	 * 模板方法任何一个相接我们购票平台必须走这个验证
	 * */
	public void validate(){
		vallidateUserName();
		vallidateSign();
		vallidateMethodName();
	}
	
}
