package com.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private List<Product> products = new ArrayList<Product>();
	private Map<String, Integer> items = new HashMap<String, Integer>();

	public void add(Product product, Integer quantity) {

		/*
		 * I assume that each product name is unique
		 */

		String productName = product.getName();

		/*
		 * If the product is already in the cart then get the current quantity
		 * and add it the new one
		 */

		if (items.get(productName) != null) {
			Integer accum;
			accum = items.get(productName) + quantity;
			items.put(productName, accum);
		} else {
			products.add(product);
			items.put(product.getName(), quantity);
		}
		System.out.println("Product successfully addded");
	}

	public void remove(Product product) {

		items.remove(product.getName());
		products.remove(product);
		System.out.println("Product successfully removed");
	}

	public Double getTotal() {

		if (items.isEmpty()) {
			System.out.println("The cart is empty!");
			return null;
		} else {

			Double subTotal, total;
			total = (double) 0;

			for (Product product : products) {
				subTotal = product.getPrice() * items.get(product.getName()); // Maybe I'll need subTotal later.
				total += subTotal;
			}

			return total;
		}

	}

	public void listItems() {

		if (items.isEmpty()) {
			System.out.println("The cart is empty!");
		} else {
			System.out.println("Cart Items: ");
			for (Product product : products) {
				System.out.println(product.toString() + "Quantity: " + items.get(product.getName()));
			}
		}

	}

}
