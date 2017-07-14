package com.Model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void add(Item Item) {
		items.add(Item);
	}

	public void remove(Item Item) {
		items.remove(Item);
	}

	public Double getTotal() {

		Double sum = (double) 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public List<Item> getItems() {
		return items;
	}

	public Item getCheapest() {

		Item cheapest = items.get(0);

		for (Item Item : items) {
			if (Item.getPrice() < cheapest.getPrice()) {
				cheapest = Item;
			}
		}
		return cheapest;
	}

	public Item getExpensive() {

		Item expensive = items.get(0);

		for (Item Item : items) {
			if (Item.getPrice() > expensive.getPrice()) {
				expensive = Item;
			}
		}
		return expensive;
	}

	public void listItems() {

		if (items.isEmpty()) {
			System.out.println("The cart is empty!");
		} else {
			System.out.println("Cart Items: ");
			for (Item Item : items) {
				System.out.println(Item.toString());
			}
			System.out.println("Total: $" + this.getTotal());
			System.out.println();
		}
		

	}

}
