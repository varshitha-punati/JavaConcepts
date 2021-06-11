package com.strings;

public class StringBuilderOtherMethods {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("jamesGosling");
		sb.setLength(8);
		System.out.println("after setting length by using setLength method the string is:"+sb);
		sb.ensureCapacity(1000);
		System.out.println("after dynamically entering capacity by using ensureCapacity method is:"+sb.capacity());
		sb.trimToSize();
		System.out.println("after triming the size:"+sb.capacity());
	}
}
