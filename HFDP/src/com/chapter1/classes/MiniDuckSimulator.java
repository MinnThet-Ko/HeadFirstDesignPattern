package com.chapter1.classes;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.perfromQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.perfromQuack();
		modelDuck.setFlyBehavior(new FlyWithRockets());
		modelDuck.performFly();
	}

}
