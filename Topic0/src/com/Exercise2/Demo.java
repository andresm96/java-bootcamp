package com.Exercise2;

public class Demo {

	public static void main(String[] args) {

		HouseBuilder houseBuilder = new AmericanHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse("wood", "Mahogany door", "Gable roof");
		House house = houseDirector.getHouse();
		System.out.println("The house was built with: " + house);

		houseBuilder = new ArgentinianHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse("bricks", "Aluminum door", "Flat roof");
		house = houseDirector.getHouse();
		System.out.println("The house was built with: " + house);
	}
}
