package com.chapter1.classes;

public class ModelDuck extends Duck{

	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck. I always look good.");
	}

}
