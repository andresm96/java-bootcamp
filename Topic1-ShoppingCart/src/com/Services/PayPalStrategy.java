package com.Services;

import com.Model.ShoppingCart;

public class PayPalStrategy extends PaymentStrategy {

	private String email;
	private String password;
	private ShoppingCart cart;

	public PayPalStrategy(String email, String password, ShoppingCart cart) {
		super();
		this.email = email;
		this.password = password;
		this.cart = cart;
	}

	@Override
	public void pay() {

		System.out.println("Total Purchase: " + cart.getTotal());
		System.out.println("Bonus: The cheapest item is for free");

	}

	@Override
	public void discount() {

		Double total = cart.getTotal();

		total -= cart.getCheapest().getPrice();
		System.out.println("Total paid with PayPal: " + total);
	}

}
