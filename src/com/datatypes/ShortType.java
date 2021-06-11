package com.datatypes;
//short->2 bytes(-32,768 to 32767)(-2>16-1 to 2>16-1)

public class ShortType {
	
	public static void main(String[] args) {
		short a = 31567;
		short b=31_567;
//		short c=-3576_7;
		
//		Binary form
//		short d=0b1111111111111111; 
		short e=0b000000001000101;
//		hexadecimal form
		short f=0xAAE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
