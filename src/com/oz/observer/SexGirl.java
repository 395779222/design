package com.oz.observer;

import java.util.ArrayList;
import java.util.List;

public class SexGirl implements Observed{
	
	private List<Observer> list = new ArrayList<Observer>();
	
	public void addWatcher(Observer observer) {
		
		list.add(observer);
	}

	public void removeWatcher(Observer observer) {
		list.remove(observer);
		
	}

	public void notifyWatchers() {
		
		for (Observer observer : list)
        {
			observer.update();
        }
		
		
	}
	
}
