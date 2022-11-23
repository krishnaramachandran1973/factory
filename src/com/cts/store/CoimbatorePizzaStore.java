package com.cts.store;

import com.cts.pizzas.Pizza;
import com.cts.pizzas.UttappamPizza;
import com.cts.pizzas.VegPizza;

public class CoimbatorePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("veg")) {
			pizza = new VegPizza();
		} else if (type.equals("uttappam")) {
			pizza = new UttappamPizza();
		}

		return pizza;

	}
}
