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
	public String pay() {

		String info;
		info = "Total Purchase: $" + cart.getTotal() + "\n";
		info += "Bonus: The cheapest item is for free\n";
		return info;

	}

	@Override
	public String discount() {

		String info;
		Double total = cart.getTotal();

		total -= cart.getCheapest().getPrice();
		info = "Total paid with PayPal: $" + total + "\n";
		return info;
	}

	@Override
	public String toString() {
		String info;
		info = "Payment method: PayPal [User email: " + email + "]\n";
		return info;
	}

}
