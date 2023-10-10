package com.learning.microservice.limitservice.bean;

public class Limits {

	private int minmum;
	private int maximun;
	public Limits(int minmum, int maximun) {
		super();
		this.minmum = minmum;
		this.maximun = maximun;
	}
	public Limits() {
		super();
	}
	public int getMinmum() {
		return minmum;
	}
	public void setMinmum(int minmum) {
		this.minmum = minmum;
	}
	public int getMaximun() {
		return maximun;
	}
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	
	
}
