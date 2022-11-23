package com.cts.store;

import com.cts.pizzas.CheesePizza;
import com.cts.pizzas.PaneerPizza;
import com.cts.pizzas.Pizza;

public class PunePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("panner")) {
			pizza = new PaneerPizza();
		}

		return pizza;

	}
}
