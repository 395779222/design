package com.oz.template;

public class LYXZ {
	
	public static void main(String[] args) {
		AbstractProvider appleProvider = new AppleProvider();
		appleProvider.validate();
		AbstractProvider taotaoProvider = new TaoTaoProvider();
		taotaoProvider.validate();
	}
	
}
