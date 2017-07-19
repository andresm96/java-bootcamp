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
	public String pay() {

		String info;
		info = "Total Purchase: $" + cart.getTotal() + "\n";
		info += "Bonus: 10%\n";
		return info;
	}

	@Override
	public String discount() {

		String info;
		final double discountRate = 0.1;
		Double total = cart.getTotal();
		total -= (total * discountRate);
		info = "Total paid with credit/debit card: $" + total + "\n";
		return info;
	}

	@Override
	public String toString() {
		String info;
		info = "Payment method: Credit Card [Name: " + name + ", Card Number: " + cardNumber + "]\n";
		return info;
	}

}
