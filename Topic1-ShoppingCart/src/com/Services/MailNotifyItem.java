package com.Services;

import com.Model.Mail;

public class MailNotifyItem implements MailNotify {

	SendMailService sendMailService = SendMailService.getInstance();

	@Override
	public void report(String message) {
		Mail mail = new Mail("marketmanager@host.com", "webmaster@host.com", "A new item/offer was added.", message);
		sendMailService.send(mail);
	}

}
