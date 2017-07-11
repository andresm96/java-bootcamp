package com.Exercise2;

public class ArgentinianHouseBuilder implements HouseBuilder {

	private House house;

	public ArgentinianHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildWalls() {
		house.setWalls("bricks");

	}

	@Override
	public void buildDoor() {
		house.setDoor("Aluminum door");

	}

	@Override
	public void buildRoof() {
		house.setRoof("Flat");

	}

	@Override
	public House getHouse() {
		return house;
	}
}
