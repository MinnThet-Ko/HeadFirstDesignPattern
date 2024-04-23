package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class NYPizzaStore extends ObjectVillPizzaStore{

	@Override
	protected Pizza createPizza(String pizzaType) {
		Pizza  pizza = null;
		if(pizzaType.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} /*else if(pizzaType.equals("greek")) {
			pizza = new GreekPizza();
		}*/ else if(pizzaType.equals("pepperoni")) {
			pizza = new  NYStylePepperoniPizza();
		} else if(pizzaType.equals("veggie")) {
			pizza = new  NYStyleVeggiePizza();
		} else if(pizzaType.equals("clam")) {
			pizza = new  NYStyleClamPizza();
		}
		return pizza;
	}

}
