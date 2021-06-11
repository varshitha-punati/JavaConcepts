package com.datatypes;

//8 bytes->-2>63 to 2>63
public class LongType {
	public static void main(String[] args) {

		long creditCardNumber = 12_345678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		long bytes = 0b11010010_01101001_10010100_10010010;
		long hexBytes = 0xFF_EC_DE_5E;

		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(bytes);
		System.out.println(hexBytes);
	}
}
