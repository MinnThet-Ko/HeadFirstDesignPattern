package com.chapter6.receivers;

public class Light extends GenericReceiver{
	
	public Light(String location) {
		super(location);
	}

	public void on() {
		System.out.println("Light's on!");
	}

	public void off() {
		System.out.println("Light's off!");
	}
}
