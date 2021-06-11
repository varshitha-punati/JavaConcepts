package com.nonnumericdatatypes;

public class CharType {
	public static void main(String[] args) {

		char char1 = 65;
		char char2 = 97;
		int num1 = 101;
		char c1 = (char) num1;

		int num2 = 68;
		char c2 = (char) num2;

		char r1 = '\u0063';
		char r2 = '\u0055';

		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);

		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);

	}
}
