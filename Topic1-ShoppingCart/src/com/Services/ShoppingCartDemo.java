package com.Services;

import com.Model.*;

public class ShoppingCartDemo {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		Product item = new Product("Watch", 100.00);
		cart.add(item);
		item = new Product("Cellphone", 280.00);
		cart.add(item);
		item = new Product("Jeans", 20.00);
		cart.add(item);
		item = new Product("Notebook", 500.00);
		cart.add(item);
		
		cart.listItems();
		
		//pay by cash
		CashStrategy cash = new CashStrategy(cart);
		cash.payWithDiscount();
		
		CreditCardStrategy card = new CreditCardStrategy("Andrew", "xxxx-xxxx-xxxx-xxxx", cart);
		card.payWithDiscount();
		
		PayPalStrategy payPal = new PayPalStrategy("user@host.com", "password", cart);
		payPal.payWithDiscount();
	}
}
