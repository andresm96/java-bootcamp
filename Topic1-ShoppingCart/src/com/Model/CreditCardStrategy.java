package com.Model;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardStrategy(String name, String cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(Double amount) {
		
		System.out.println(discount(amount) + " paid with credit/debit card");

	}

	@Override
	public double discount(Double amount) {

		final double discountRate = 0.1;
		Double total = amount;
		total -= (total * discountRate);
		return total;
	}

}
