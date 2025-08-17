package com.chapter6.receivers;

public class CeilingFan extends GenericReceiver{

	public CeilingFan(String location) {
		super(location);
	}
	
	
	public void on() {
		System.out.println("The ceiling fan in " + this.getLocation().toLowerCase() + " is on." );
	}
	
	public void off() {
		System.out.println("The ceiling fan in " + this.getLocation().toLowerCase() + " is off." );
	}
	

}
