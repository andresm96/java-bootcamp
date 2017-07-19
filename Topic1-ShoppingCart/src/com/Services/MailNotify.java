package com.Services;

public interface MailNotify {

	public void sendChangePrice(String body);

	public void sendNewItem(String body);

	public void sendNewTransaction(String body);
}
