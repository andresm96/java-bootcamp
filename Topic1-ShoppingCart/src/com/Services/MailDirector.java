package com.Services;

import com.Model.Mail;

public class MailDirector {

	private MailBuilder mailBuilder = null;

	public MailDirector(MailBuilder mailBuilder) {
		this.mailBuilder = mailBuilder;
	}

	public void constructMail(String to, String from, String subject, String body) {
		mailBuilder.buildTo(to);
		mailBuilder.buildFrom(from);
		mailBuilder.buildSubject(subject);
		mailBuilder.buildBody(body);
	}

	public Mail getMail() {
		return mailBuilder.getMail();
	}

}
