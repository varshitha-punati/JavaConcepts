package com.abstraction;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
//		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input value");
		String input = sc.next();

		if ((input.charAt(0) >= '0') && (input.charAt(0) <= '9')) {
			System.out.println("number is");
		} else if ((input.charAt(0) >= 'a') && (input.charAt(0) <= 'z')) {
			System.out.println("String");
		} else {
			System.out.println("special character");
		}
	}
}
