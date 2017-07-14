package com.Services;

import com.Model.ShoppingCart;

public class CreditCardStrategy extends PaymentStrategy {

	private String name;
	private String cardNumber;
	private ShoppingCart cart;

	public CreditCardStrategy(String name, String cardNumber, ShoppingCart cart) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cart = cart;
	}

	@Override
	public void pay() {

		System.out.println("Total Purchase: $" + cart.getTotal());
		System.out.println("Bonus: 10%");

	}

	@Override
	public void discount() {

		final double discountRate = 0.1;
		Double total = cart.getTotal();
		total -= (total * discountRate);
		System.out.println("Total paid with credit/debit card: $" + total);
	}

}
