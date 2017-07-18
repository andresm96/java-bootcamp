package com.Model;

import java.util.ArrayList;
import java.util.List;

public class Offer extends Item {

	/*
	 * I assume an offer as an individual item in the cart
	 */

	private List<Product> products;
	private String name;
	private Double price;

	public Offer(String name) {
		products = new ArrayList<Product>();
		this.name = name;
	}

	public void add(Product product) {
		products.add(product);
	}

	public void remove(Product product) {
		products.remove(product);
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		if (price == null) {
			calculatePrice();
		}
		return price;
	}

	public void calculatePrice() {

		/*
		 * Just an example of quantity and discount
		 */

		Double total = getTotal();
		Double discount = 0.0;
		if (products.size() <= 5) {
			discount = 0.1;
		} else if ((products.size() > 5) && (products.size() <= 10)) {
			discount = 0.2;
		} else {
			discount = 0.3;
		}
		price = total - (total * discount);
		notifyItem(this.toString());

	}

	public void setPrice(Double price) {
		this.price = price;
		notifyPrice(this.toString());
	}

	public double getTotal() {

		Double total = 0.00;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		String offer = "Offer Name: " + name + " Price: $ " + getPrice();
		for (Product product : products) {
			offer += "\n\t" + product.toString();
		}
		return offer;
	}

}
