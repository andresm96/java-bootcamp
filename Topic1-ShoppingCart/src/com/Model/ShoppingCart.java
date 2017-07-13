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
	
	public void pay(PaymentStrategy paymentMethod){
		double amount = getTotal();
		paymentMethod.pay(amount);
	}
	
	public List<Product> getItems(){
		return items;
	}

	public void listItems() {

		if (items.isEmpty()) {
			System.out.println("The cart is empty!");
		} else {
			System.out.println("Cart Items: ");
			for (Product product : items) {
				System.out.println(product.toString());
			}
		}

	}

}
