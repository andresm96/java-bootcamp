package com.Exercise2;

public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructMeal() {
		houseBuilder.buildWalls();
		houseBuilder.buildDoor();
		houseBuilder.buildRoof();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
