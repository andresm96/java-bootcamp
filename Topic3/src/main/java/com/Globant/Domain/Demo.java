package com.Globant.Domain;

public class Demo {
	public static void main(String[] args) {
		Converter converter = new Converter();
		try {
			System.out.println(converter.convert(null));
		} catch (NullPointerException e) {
			System.out.println("Null argument is not allowed");
		}
		System.out.println(converter.convert(5.0));
		System.out.println(converter.convert(18.0));
		System.out.println(converter.convert(69.0));
		System.out.println(converter.convert(108.0));
		System.out.println(converter.convert(8612.0));
	}
}
