package com.Exercise2;

public class Demo {

	public static void main(String[] args) {

		HouseBuilder mealBuilder = new AmericanHouseBuilder();
		HouseDirector mealDirector = new HouseDirector(mealBuilder);
		mealDirector.constructMeal();
		House meal = mealDirector.getHouse();
		System.out.println("The house was built with: " + meal);

		mealBuilder = new ArgentinianHouseBuilder();
		mealDirector = new HouseDirector(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getHouse();
		System.out.println("The house was built with: " + meal);
	}
}
