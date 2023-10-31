package com.classes;

import com.interfaces.FlyBehavior;

public class FlyWithRockets implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying to the moon, babes!");
	}

}
