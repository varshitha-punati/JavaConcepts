package com.strings;

public class StringBuilderConstructors {
	public static void main(String[] args) {
//		creating empty stringbuilder with default capacity
		StringBuilder sb=new StringBuilder();
		System.out.println("empty StringBuilder Constructor capacity:"+sb.capacity());
//		creating StringBuilder with intial capacity
		StringBuilder sb1=new StringBuilder(1000);
		System.out.println("StringBuilder Constructor capacity:"+sb1.capacity());
//		for given String creating equivalent string object
		StringBuilder sb2=new StringBuilder("varshi");
		System.out.println("stringbuilder capacity for equivalent string:"+sb2.capacity());
	}
}
