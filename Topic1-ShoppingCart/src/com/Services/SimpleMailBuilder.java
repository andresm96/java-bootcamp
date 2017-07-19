package com.Services;

import com.Model.Mail;

public class SimpleMailBuilder implements MailBuilder {

	private Mail mail;

	public SimpleMailBuilder() {
		mail = new Mail();
	}

	@Override
	public void buildTo(String to) {
		mail.setTo(to);

	}

	@Override
	public void buildFrom(String from) {
		mail.setFrom(from);

	}

	@Override
	public void buildSubject(String subject) {
		mail.setSubjet(subject);

	}

	@Override
	public void buildBody(String body) {
		mail.setBody(body);

	}

	@Override
	public Mail getMail() {
		return mail;
	}

}
