package com.chapter1.classes;

import com.chapter1.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
