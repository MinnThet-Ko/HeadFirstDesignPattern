package com.chapter1.classes;

import com.chapter1.interfaces.FlyBehavior;
import com.chapter1.interfaces.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void perfromQuack() {
		this.quackBehavior.quack();
	}
	
	public void performSwim() {
		System.out.println("All ducks swim, even the decoys float.");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
