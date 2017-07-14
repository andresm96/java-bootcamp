package com.Model;

import java.util.ArrayList;
import java.util.List;

public class Offer {

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

	public double getPrice() {

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
		return price;
	}

	public double getTotal() {

		Double total = 0.00;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	public void print() {
		System.out.println("Offer Name: " + name + " Price: $" + getPrice());
		for (Product product : products) {
			System.out.println("\t" + product.toString());
		}
		System.out.println();
	}
}
