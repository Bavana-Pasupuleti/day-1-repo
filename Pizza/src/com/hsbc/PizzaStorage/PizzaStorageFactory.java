package com.hsbc.PizzaStorage;

public class PizzaStorageFactory {
	public static PizzaStore getPizzaStorage() {
		PizzaStore pobj=new PizzaStoreImpl();
		return pobj;
	}
	
	

}
