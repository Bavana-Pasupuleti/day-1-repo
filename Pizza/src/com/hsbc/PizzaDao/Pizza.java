package com.hsbc.PizzaDao;

public class Pizza {
	String pizzaName,majorIngredientOne,majorIngredientTwo,majorIngredientThree;
	String description;
	int sizeInCms;
	float weight,price;
	
	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}

	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}

	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}

	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}

	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}

	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}

	public int getSizeInCms() {
		return sizeInCms;
	}

	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return "Pizza name : "+pizzaName+" Pizza description : "+description+" Major Ingridient 1 : "+majorIngredientOne+" Major Ingridient 2:  "+majorIngredientTwo+" Major Ingridient 3 : "+majorIngredientThree+" Weight : "+weight+" Size : "+sizeInCms+" Price : "+price;
	}

	public void preparation() {
		
	}

}
