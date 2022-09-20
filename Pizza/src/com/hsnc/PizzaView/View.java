package com.hsnc.PizzaView;

import java.util.Scanner;

import com.hsbc.PizzaDao.Pizza;
import com.hsbc.PizzaStorage.PizzaStoreImpl;

public class View {
	Scanner sc;
	public Pizza getPizaa() {
		
		
		Pizza pizza=new Pizza();
		sc=new Scanner(System.in);
		
		System.out.println("Enter name of Pizza");
		pizza.setPizzaName(sc.nextLine());
		System.out.println("Enter description");
		pizza.setDescription(sc.nextLine());
		System.out.println("Enter Major Ingridient 1");
		pizza.setMajorIngredientOne(sc.nextLine());
		System.out.println("Enter Major Ingridient 2");
		pizza.setMajorIngredientTwo(sc.nextLine());
		System.out.println("Enter Major Ingridient 3");
		pizza.setMajorIngredientThree(sc.nextLine());
		System.out.println("Entersize in cms");
		pizza.setSizeInCms(sc.nextInt());
		System.out.println("Enter weight");
		pizza.setWeight(sc.nextFloat());
		System.out.println("Enter Price");
		pizza.setPrice(sc.nextFloat());
		return pizza;
		
	}

	public static void main(String[] args) {
		View viewobj=new View();
		Scanner sc=new Scanner(System.in);
		PizzaStoreImpl impl=new PizzaStoreImpl(); 
		try {
			if(impl.addNewPizza(viewobj.getPizaa())) {
				System.out.println("Details added successfully");
				System.out.println("Add next Pizza");
				impl.addNewPizza(viewobj.getPizaa());
			}
			else {
				System.out.println("Pizza already exists");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(impl.pizzaList.size());
		System.out.println("Enter the name of pizza you want : ");
		String choice=sc.nextLine();
		try {
			System.out.println(impl.getPizzaByName(choice).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
