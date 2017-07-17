package com.Model;

public class Product extends Item {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
		super.reportChange("item");
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
		super.reportChange("price");
	}

	@Override
	public String toString() {
		return "Product [name: " + name + ", price: $" + price + "]";
	}

}
