package com.Services;

public abstract class PaymentStrategy {

	public abstract void pay();

	public abstract void discount();

	public void payWithDiscount() {
		pay();
		discount();
	}
}
