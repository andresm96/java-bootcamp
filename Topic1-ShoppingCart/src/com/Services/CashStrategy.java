package com.Services;

import com.Model.Item;
import com.Model.ShoppingCart;

public class CashStrategy extends PaymentStrategy {

	private ShoppingCart cart;

	public CashStrategy(ShoppingCart cart) {
		super();
		this.cart = cart;
	}

	@Override
	public String pay() {

		String info;
		info = "Total Purchase: $" + cart.getTotal() + "\n";
		info += "Bonus: 90% of the most expensive item is free\n";
		return info;

	}

	@Override
	public String discount() {

		String info;
		final double discountRate = 0.9;
		Double total = cart.getTotal();
		Item expensive = cart.getExpensive();
		total -= ((expensive.getPrice()) * discountRate);
		info = "Total paid with Cash: $" + total + "\n";
		return info;
	}

	@Override
	public String toString() {
		String info;
		info = "Payment method: Cash\n";
		return info;
	}
}
