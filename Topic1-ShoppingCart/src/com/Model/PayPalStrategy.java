package com.Model;

public class PayPalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PayPalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void pay(Double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public double discount(Double amount) {
		
		
		return 0;
	}

}
