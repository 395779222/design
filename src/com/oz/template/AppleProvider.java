package com.oz.template;

public class AppleProvider extends AbstractProvider{

	@Override
	public void vallidateUserName() {
		System.out.println("苹果客户端请求用户名验证通过");
		
	}

	@Override
	public void vallidateMethodName() {
		System.out.println("苹果客户端请求方法名验证通过");
		
	}

	@Override
	public void vallidateSign() {
		System.out.println("苹果客户端请求签名信息验证通过");
		
	}

}
