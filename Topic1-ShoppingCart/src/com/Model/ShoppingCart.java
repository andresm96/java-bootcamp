package com.Model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> items;

	public ShoppingCart() {
		this.items = new ArrayList<Product>();
	}

	public void add(Product product) {
		items.add(product);
	}

	public void remove(Product product) {
		items.remove(product);
	}

	public Double getTotal() {

		Double sum = (double) 0;
		for (Product item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public List<Product> getItems() {
		return items;
	}

	public Product getCheapest() {

		Product cheapest = items.get(0);

		for (Product product : items) {
			if (product.getPrice() < cheapest.getPrice()) {
				cheapest = product;
			}
		}
		return cheapest;
	}

	public Product getExpensive() {

		Product expensive = items.get(0);

		for (Product product : items) {
			if (product.getPrice() > expensive.getPrice()) {
				expensive = product;
			}
		}
		return expensive;
	}

	public void listItems() {

		if (items.isEmpty()) {
			System.out.println("The cart is empty!");
		} else {
			System.out.println("Cart Items: ");
			for (Product product : items) {
				System.out.println(product.toString());
			}
			System.out.println("Total: $" + this.getTotal());
			System.out.println();
		}
		

	}

}
