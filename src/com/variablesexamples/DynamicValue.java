package com.variablesexamples;

import java.util.Scanner;

public class DynamicValue {

	public static void main(String[] args) {
		
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String input = sc.next();
		
		if ((input.charAt(i) >= 'a') && (input.charAt(i) <= 'z')) {
			System.out.println("string");
			
		} else if ((input.charAt(i) >= '0') && (input.charAt(i) <= '9')) {
			System.out.println("number");
		} else {
			System.out.println("special cahracter");
		}

	}
}
