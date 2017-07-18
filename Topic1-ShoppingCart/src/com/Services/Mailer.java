package com.Services;

public class Mailer implements MailNotify {

	private static SimpleMailBuilder simpleMail = new SimpleMailBuilder();
	private static MailDirector mailDirector = new MailDirector(simpleMail);

	/*
	 * if there are multiple emitters or recipients we can create a new
	 * "complexMailBuilder" class.
	 */

	public void sendChangePrice(String body) {
		mailDirector.constructMail("marketmanager@host.com", "webmaster@host.com", "The price of an item / offer has changed.", body);
		SendMailService mailService = SendMailService.getInstance();
		mailService.send(mailDirector.getMail());
		
	}

	public void sendNewItem(String body) {
		mailDirector.constructMail("marketmanager@host.com", "webmaster@host.com", "A new item / offer was added.", body);
		SendMailService mailService = SendMailService.getInstance();
		mailService.send(mailDirector.getMail());
	}

	public void sendNewTransaction(String body) {
		mailDirector.constructMail("marketmanager@host.com", "webmaster@host.com", "A new transaction was made.", body);
		SendMailService mailService = SendMailService.getInstance();
		mailService.send(mailDirector.getMail());
	}

}
