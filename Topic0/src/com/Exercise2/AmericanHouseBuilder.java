package com.Exercise2;

public class AmericanHouseBuilder implements HouseBuilder {

	private House house;

	public AmericanHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildWalls() {
		house.setWalls("wood");

	}

	@Override
	public void buildDoor() {
		house.setDoor("Mahogany door");

	}

	@Override
	public void buildRoof() {
		house.setRoof("Gable roof");

	}

	@Override
	public House getHouse() {
		return house;
	}

}
