package com.Services;

import com.Model.Mail;

public class MailNotifyPrice implements MailNotify {

	SendMailService sendMailService = SendMailService.getInstance();

	@Override
	public void report(String message) {
		Mail mail = new Mail("marketmanager@host.com", "webmaster@host.com", "The price of an offer/item changed.", message);
		sendMailService.send(mail);
	}

}
