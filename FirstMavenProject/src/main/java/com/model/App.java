package com.model;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Enter a name: ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			System.out.println("Welcome " + sc.nextLine());
		}
	}
}
