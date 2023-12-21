package com.chapter1.classes;

import com.chapter1.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I ain't flying.");
	}

}
