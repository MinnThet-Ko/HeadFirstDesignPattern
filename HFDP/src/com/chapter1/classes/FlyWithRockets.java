package com.chapter1.classes;

import com.chapter1.interfaces.FlyBehavior;

public class FlyWithRockets implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying to the moon, babes!");
	}

}
