package com.Model;

import com.Services.Mailer;

public abstract class Item {

	/*
	 * I made this Abstract Class to make sure that Product and Offer classes
	 * implements the same four methods below
	 */
	public static Mailer mailer = new Mailer();

	public abstract String getName();

	public abstract Double getPrice();

	public abstract void setPrice(Double price);
	
	public void notifyItem(String body) {
		mailer.sendNewItem(body);
	}
	
	public void notifyPrice(String body) {
		mailer.sendChangePrice(body);
	}


}
