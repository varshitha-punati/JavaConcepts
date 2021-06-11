package com.strings;

public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("varshi java");
		System.out.println("To find length of stringBuilder we use this length method:"+sb.length());
		System.out.println("To find capacity of StringBuilder we use capcity method:"+sb.capacity());
		System.out.println("To find char at specified position we use this method charAtmethod:"+sb.charAt(5));
		sb.setCharAt(0, 'a');
		System.out.println("after replacing character by using setChar method the result is:"+sb);
		sb.setCharAt(0, 'v');
		sb.append(" and jamesGosling java");
		System.out.println("after append the value the string is:"+sb);
		sb.insert(7, "Core");
		System.out.println("after inserting value by using insert method the string is:"+sb);
		sb.delete(13, 35);
		System.out.println("after deleting string from specified index to specified index by using delete method the string is:"+sb);
		sb.deleteCharAt(6);
		System.out.println("delete char at specified index:"+sb);
		sb.reverse();
		System.out.println("after reversing a string:"+sb);
	}
}
