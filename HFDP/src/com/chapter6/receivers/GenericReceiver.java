package com.chapter6.receivers;

public abstract class GenericReceiver {
	
	private String location;
	
	public GenericReceiver(String location) {
		this.location = "";
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public abstract void on();
	
	public abstract void off();

}
