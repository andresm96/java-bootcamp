package com.Exercise2;

public class House {
	
	/*
	 * To build a house we define the materials and
	 * print them in the console log.
	 */
	
	private String walls;
	private String door;
	private String roof;

	public String getWalls() {
		return walls;
	}

	public void setWalls(String walls) {
		this.walls = walls;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String toString() {
		return "Wall material: " + walls + ", type of door: " + door + ", type of roof: " + roof;
	}

}
