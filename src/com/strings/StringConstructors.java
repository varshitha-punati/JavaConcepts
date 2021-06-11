package com.strings;

public class StringConstructors {
	public static void main(String[] args) {
		
//		1.creating an empty String
		String s=new String();
		
//		2.Creating a equivalent string for String Literal
		String s1=new String("String literal");
		
//		3.creating equivalent string to StringBuffer Object
		StringBuffer sbuf=new StringBuffer("StringBuffer object");
		String s2=new String(sbuf);
		
//		4.creating equivalent string to StringBuilder Object
		StringBuilder sbuild=new StringBuilder("StringBuilder object");
		String s3=new String(sbuild);
		
//		5.creating equivalent string to char array Object
		char arr[]= {'c','h','a','r','a','r','r','a','y'};
		String s4=new String(arr);
		
//		6.creating equivalent string to int array Object
		byte arr1[]= {97,98,99,100,101};
		String s5=new String(arr1);
		
		
//		prinitng all the string values
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		}
	}

