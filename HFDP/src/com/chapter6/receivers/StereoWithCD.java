package com.chapter6.receivers;

public class StereoWithCD extends GenericReceiver{

	public StereoWithCD(String location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		System.out.println("The stereo is on");
	}

	@Override
	public void off() {
		System.out.println("The stereo is off");
	}
	
	
	
	

}
