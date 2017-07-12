package com.Exercise2;

public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse(String wallType, String doorType, String roofType) {
		houseBuilder.buildWalls(wallType);
		houseBuilder.buildDoor(doorType);
		houseBuilder.buildRoof(roofType);
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
