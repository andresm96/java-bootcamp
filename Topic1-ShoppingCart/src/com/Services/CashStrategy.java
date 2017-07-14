package com.Services;

import com.Model.Item;
import com.Model.Product;
import com.Model.ShoppingCart;

public class CashStrategy extends PaymentStrategy {

	private ShoppingCart cart;

	public CashStrategy(ShoppingCart cart) {
		super();
		this.cart = cart;
	}

	@Override
	public void pay() {

		System.out.println("Total Purchase: $" + cart.getTotal());
		System.out.println("Bonus: 90% of the most expensive item is free");

	}

	@Override
	public void discount() {

		final double discountRate = 0.9;
		Double total = cart.getTotal();
		Item expensive = cart.getExpensive();
		total -= ((expensive.getPrice()) * discountRate);
		System.out.println("Total paid with Cash: $" + total);
	}
}
