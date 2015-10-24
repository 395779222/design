package com.oz.observer;

public class LYXZ {
	public static void main(String[] args) {
		Observed sexGirl = new SexGirl();
		
		sexGirl.addWatcher(new Besite());
		sexGirl.notifyWatchers();
	}
	
}
