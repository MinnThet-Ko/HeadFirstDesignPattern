package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String pizzaType) {
		Pizza  pizza = null;
		if(pizzaType.equals("cheese")) {
			pizza = new CheesePizza();
		} /*else if(pizzaType.equals("greek")) {
			pizza = new GreekPizza();
		}*/ else if(pizzaType.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if(pizzaType.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if(pizzaType.equals("clam")) {
			pizza = new ClamPizza();
		}
		return pizza;
	}

}
