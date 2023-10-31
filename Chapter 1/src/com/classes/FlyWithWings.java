package com.classes;

import com.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying and serving Icarus realness, honey!");
	}
	
}
