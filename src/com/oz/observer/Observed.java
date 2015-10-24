package com.oz.observer;

/*
 * 其实美女很多，也常常被人追
 * 那么此美女就是被观察
 *
 * */
public interface Observed {
	
	  public void addWatcher(Observer observer);

	  public void removeWatcher(Observer observer);

	  public void notifyWatchers();
}
