package com.classes;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super.flyBehavior = new FlyWithWings();
		super.quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("Hey, I'm a Mallard duck.");		
	}

}
