package com.Services;

public abstract class PaymentStrategy {

	private static long id = 0;

	public abstract void pay();

	public abstract void discount();

	public void payWithDiscount() {
		
		pay();
		discount();
		System.out.println("Identification of payment transaction: " + getNewId());
		System.out.println();
	}

	public static long getNewId() {
		return ++id;
	}
}
