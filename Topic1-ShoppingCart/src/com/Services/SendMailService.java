package com.Services;

import com.Model.Mail;

public class SendMailService {

	/*
	 * Singleton Class
	 */

	private static SendMailService sendMailService = null;

	private SendMailService() {
	}

	public static SendMailService getInstance() {
		if (sendMailService == null) {
			sendMailService = new SendMailService();
		}
		return sendMailService;
	}

	public void send(Mail mail) {
		System.out.println("\n\nSending email . . . ");
		System.out.print(mail.toString());
	}
}
