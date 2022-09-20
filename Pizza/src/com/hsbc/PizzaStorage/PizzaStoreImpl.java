package com.hsbc.PizzaStorage;

import com.hsbc.PizzaDao.Pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaStoreImpl implements PizzaStore {
	
	public List<Pizza> pizzaList=new ArrayList<>();; 
	@Override
	public Boolean addNewPizza(Pizza e) throws Exception {
		
		boolean success=false;
		boolean condition=false;
		if(pizzaList.size()>0) {
		for(Pizza p:pizzaList) {
			if(p.equals(e)) {
				condition=true;
				break;
			}
			else {
				pizzaList.add(e);
				success=true;
				break;
			} 
		}
		}else {
			pizzaList.add(e);
			success=true;
		}
		if(condition) {
			throw new Exception("Pizza already exists");
		}
		return success;
	}

	@Override
	public Pizza getPizzaByName(String pizzaname) throws Exception {
		boolean condition=false;
		if(pizzaList.size()>0) {
			for(Pizza p:pizzaList) {
				if((p.getPizzaName().toLowerCase().trim()).equals(pizzaname.toLowerCase().trim())) {
					condition=true;
					return p;
				}
				else {
					return null;
				}	
			}
			if(!condition) {
					throw new Exception("Pizza not in list");
				}
		}
		return null;
	}
	
	@Override
	public Pizza[] getPizzaNamesBySize(int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
