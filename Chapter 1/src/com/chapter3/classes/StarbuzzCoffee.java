package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		
		System.out.println(String.format("Your order: %s $%f", beverage1.getDescription(), beverage1.cost()));

		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 =  new Whip(beverage2);
		
		System.out.println(String.format("Your order: %s $%f", beverage2.getDescription(), beverage2.cost()));
		
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 =  new Whip(beverage3);
		
		System.out.println(String.format("Your order: %s $%f", beverage3.getDescription(), beverage3.cost()));
	}

}
