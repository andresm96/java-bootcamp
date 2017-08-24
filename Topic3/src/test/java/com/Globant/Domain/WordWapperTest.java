package com.Globant.Domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWapperTest {

	private WordWrapper wordWrapper;
	
	@Test
	public void create() {
		wordWrapper = new WordWrapper();
	}
	
	@Test
	public void noWrapp(){
		wordWrapper = new WordWrapper();
		assertEquals("Unforeseen consequences", wordWrapper.breakSentence("Unforeseen consequences",60));
		System.out.println(wordWrapper.breakSentence("Unforeseen consequences",60));
	}
	
	@Test
	public void simpleWord(){
		wordWrapper = new WordWrapper();
		assertEquals("Excel\nent", wordWrapper.breakSentence("Excelent",5));
		System.out.println(wordWrapper.breakSentence("Excelent",5));
	}
	
	@Test
	public void spacedWord(){
		wordWrapper = new WordWrapper();
		assertEquals("Hello\nWorld!", wordWrapper.breakSentence("Hello World!",7));
		System.out.println(wordWrapper.breakSentence("Hello World!",7));
	}
	
	@Test
	public void moreSpacedWord(){
		wordWrapper = new WordWrapper();
		assertEquals("ab\ncd\nef", wordWrapper.breakSentence("ab cd ef", 3));
		System.out.println(wordWrapper.breakSentence("ab cd ef", 3));
	}
	

}
