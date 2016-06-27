package com.algorithm.dynamicProgramming;

public class Zone {
	int id;
	int value;
	int weight;
	boolean isForZuiYou = false;
	

	public boolean isForZuiYou() {
		return isForZuiYou;
	}
	public void setForZuiYou(boolean isForZuiYou) {
		this.isForZuiYou = isForZuiYou;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
