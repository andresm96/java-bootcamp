package com.Model;

import com.Services.MailNotifyItem;
import com.Services.MailNotifyPrice;

public abstract class Item {

	/*
	 * I made this Abstract Class to make sure that Product and Offer classes
	 * implements the same four methods below
	 */

	public abstract String getName();

	public abstract Double getPrice();

	public abstract void setPrice(Double price);

	public abstract String toString();

	public void reportChange(String type) {
		
		if (type.equals("price")) {
			MailNotifyPrice newPrice = new MailNotifyPrice();
			String message = this.toString();
			newPrice.report(message);
		} else if(type.equals("item")){
			MailNotifyItem newItem = new MailNotifyItem();
			String message = this.toString();
			newItem.report(message);
		}
	}

}
