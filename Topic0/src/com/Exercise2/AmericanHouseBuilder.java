package com.Exercise2;

public class AmericanHouseBuilder implements HouseBuilder {

	private House house;

	public AmericanHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildWalls(String wallType) {
		house.setWalls(wallType);

	}

	@Override
	public void buildDoor(String doorType) {
		house.setDoor(doorType);

	}

	@Override
	public void buildRoof(String roofType) {
		house.setRoof(roofType);

	}

	@Override
	public House getHouse() {
		return house;
	}

}
