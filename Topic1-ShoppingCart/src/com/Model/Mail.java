package com.Model;

public class Mail {

	private String to;
	private String from;
	private String subjet;
	private String body;

	public Mail(String to, String from, String subjet, String body) {
		super();
		this.to = to;
		this.from = from;
		this.subjet = subjet;
		this.body = body;
	}

	@Override
	public String toString() {
		String mail = "To: " + to + "\nFrom: " + from + "\nSubjet: " + subjet + "\nBody:\n" + body;
		return mail;
	}

}
