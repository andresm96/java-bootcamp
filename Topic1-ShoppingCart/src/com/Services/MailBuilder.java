package com.Services;

import com.Model.Mail;

public interface MailBuilder {
	
	public void buildTo(String to);

	public void buildFrom(String from);

	public void buildSubject(String subject);
	
	public void buildBody(String body);

	public Mail getMail();
}
