package com.cts.factory;

import com.cts.pizzas.CheesePizza;
import com.cts.pizzas.IndianPizza;
import com.cts.pizzas.PaneerPizza;
import com.cts.pizzas.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza  = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("paneer")) {
			pizza = new PaneerPizza();
		} else if (type.equals("indian")) {
			pizza  = new IndianPizza();
		}
		
		return pizza;
	}

}
