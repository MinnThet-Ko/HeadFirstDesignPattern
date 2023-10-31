package com.classes;

import com.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I ain't flying.");
	}

}
