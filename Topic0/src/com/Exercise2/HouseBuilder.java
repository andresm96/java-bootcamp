package com.Exercise2;

public interface HouseBuilder {

	public void buildWalls(String wallType);

	public void buildDoor(String doorType);

	public void buildRoof(String roofType);

	public House getHouse();
}
