package com.strings;

public class StringBufferMutability {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("james Gosling");
		System.out.println(s);
		s.append(" java");
		System.out.println("After appending java to StringBuffer");
		System.out.println(s);
	}
}
