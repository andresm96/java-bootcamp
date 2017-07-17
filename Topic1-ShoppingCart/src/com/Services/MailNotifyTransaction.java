package com.Services;

import com.Model.Mail;

public class MailNotifyTransaction implements MailNotify {

	SendMailService sendMailService = SendMailService.getInstance();

	@Override
	public void report(String message) {
		Mail mail = new Mail("marketmanager@host.com", "webmaster@host.com", "A new transaction was made.", message);
		sendMailService.send(mail);
	}

}
