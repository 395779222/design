package com.oz.template;

public class TaoTaoProvider extends AbstractProvider{

	@Override
	public void vallidateUserName() {
		System.out.println("淘淘客户端请求用户名验证通过");
		
	}

	@Override
	public void vallidateMethodName() {
		System.out.println("淘淘客户端请求方法验证通过");
		
	}

	@Override
	public void vallidateSign() {
		System.out.println("淘淘客户端请求签名验证通过");
		
	}

}
