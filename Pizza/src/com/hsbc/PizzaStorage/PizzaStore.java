package com.hsbc.PizzaStorage;

import com.hsbc.PizzaDao.Pizza;

public interface PizzaStore {
	Boolean addNewPizza(Pizza e) throws Exception;
	Pizza getPizzaByName(String pizzaname) throws Exception;
	Pizza[] getPizzaNamesBySize(int size) throws Exception;
}
