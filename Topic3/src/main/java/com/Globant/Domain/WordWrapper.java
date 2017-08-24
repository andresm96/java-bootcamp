package com.Globant.Domain;

public class WordWrapper {

	public String breakSentence(String sentence, int segment) {

		String text = "";
		if (sentence.length() <= segment) {
			return sentence;
		} else {

			int infLimit = 0;
			int supLimit = segment;
			String token;

			do {
				token = sentence.substring(infLimit, supLimit);
				int space = token.indexOf(' ') + infLimit;
				if (space != -1) {
					token = sentence.substring(infLimit, space);
					text += token + "\n";
					infLimit = space + 1;
					supLimit += segment;
					if (supLimit > sentence.length())
						break;
				} else {
					token = sentence.substring(infLimit, supLimit);
					text += token + "\n";
					infLimit = supLimit;
					supLimit += segment;
				}
			} while (supLimit <= sentence.length());
			token = sentence.substring(infLimit, sentence.length());
			text += token;
			return text;
		}
	}

}
