package com.Model;

public class Product extends Item {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
		notifyItem(this.toString());
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
		notifyPrice(this.toString());
	}

	@Override
	public String toString() {
		return "Product [name: " + name + ", price: $" + price + "]";
	}

}
