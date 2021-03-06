package com.Model;

public class Mail {

	private String to;
	private String from;
	private String subjet;
	private String body;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubjet() {
		return subjet;
	}

	public void setSubjet(String subjet) {
		this.subjet = subjet;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		String mail = "****************************************\n";
		mail += "To: " + to + "\nFrom: " + from + "\nSubjet: " + subjet + "\nBody:\n" + body + "\n";
		mail += "****************************************\n\n";
		return mail;
	}

}
