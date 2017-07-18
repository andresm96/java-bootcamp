package com.Services;

public abstract class PaymentStrategy {

	private static long id = 0;
	public static Mailer mailer = new Mailer();

	public abstract String pay();

	public abstract String discount();

	public void payWithDiscount() {

		Long newId = getNewId();
		String paymentInfo;
		paymentInfo = this.toString();
		paymentInfo += pay();
		paymentInfo += discount();
		paymentInfo += "Identification of payment transaction: " + newId;

		System.out.println(paymentInfo);
		System.out.println();
		
		mailer.sendNewTransaction(paymentInfo);
	}

	public static long getNewId() {
		return ++id;
	}
}
