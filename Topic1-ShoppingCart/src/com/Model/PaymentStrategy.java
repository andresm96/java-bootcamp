package com.Model;

public interface PaymentStrategy {
	
	public void pay(Double amount);
	
	public double discount(Double amount);
}
