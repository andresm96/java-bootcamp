package com.Globant.Domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordTest {
	
	Converter converter;
	
	@Test
	public void create() {
		converter = new Converter();
	}

	@Test
	public void simpleConvert() {
		Integer amount = 21;
		converter = new Converter();
		assertEquals("twenty one", converter.getTenUnit(amount));
	}

	@Test
	public void complexConvert() {
		Double amount = 1892.06;
		converter = new Converter();
		assertEquals("one thousand eight hundred ninety two and 06/100 dollars",converter.convert(amount));
		System.out.println(converter.convert(amount));
	}
}
