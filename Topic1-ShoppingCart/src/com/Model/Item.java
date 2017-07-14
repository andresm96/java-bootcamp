package com.Model;

public abstract class Item {

	/*
	 * I made this interface to make sure that Product and Offer classes
	 * implements the same two methods below
	 */

	public abstract String getName();

	public abstract Double getPrice();

	public abstract String toString();

}
