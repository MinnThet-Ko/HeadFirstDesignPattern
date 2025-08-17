package com.chapter6.receivers;

public class GarageDoor extends GenericReceiver{
	
	public GarageDoor(String location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	public void up() {
		System.out.println("Garage door is going up.");
	}

	public void down() {
		System.out.println("Garage door is going down.");
	}
	
	public void stop() {
		System.out.println("Garage door is stopped.");
	}
	
	public void on() {
		System.out.println("Garage door light is on.");
	}
	
	public void off() {
		System.out.println("Garage door light is off.");
	}
}
