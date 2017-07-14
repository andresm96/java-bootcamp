package com.Services;

import com.Model.Mail;

public class SendMailService {
	
	public void send(Mail mail){
		System.out.println("Sending email . . . ");
		System.out.print(mail.toString());
	}
}
