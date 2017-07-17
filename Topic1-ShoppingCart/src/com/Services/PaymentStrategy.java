package com.Services;

public abstract class PaymentStrategy {

	private static long id = 0;

	public abstract String pay();

	public abstract String discount();

	public abstract String toString();

	public void payWithDiscount() {

		Long newId = getNewId();
		String paymentInfo ;
		paymentInfo = this.toString();
		paymentInfo += pay();
		paymentInfo += discount();
		paymentInfo += "Identification of payment transaction: " + newId;

		System.out.println(paymentInfo);
		System.out.println();

		MailNotifyTransaction newTransaction = new MailNotifyTransaction();
		newTransaction.report(paymentInfo);
	}

	public static long getNewId() {
		return ++id;
	}
}
