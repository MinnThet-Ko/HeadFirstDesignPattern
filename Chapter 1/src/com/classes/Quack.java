package com.classes;

import com.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
