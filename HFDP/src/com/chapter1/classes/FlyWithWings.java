package com.chapter1.classes;

import com.chapter1.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying and serving Icarus realness, honey!");
	}
	
}
