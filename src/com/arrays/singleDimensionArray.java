package com.arrays;

import java.util.Scanner;

public class singleDimensionArray {
	String name[];//local array
	int marks[];//local array
	public static void main(String[] args) {
	
		singleDimensionArray s=new singleDimensionArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		s.name=new String[size];
		s.marks = new int[size];

		for(int i=0;i<s.name.length;i++) {
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter marks:");
			int marks=sc.nextInt();
			s.name[i]=name;
			s.marks[i]=marks;
		}
		for(int i=0;i<=s.name.length-1;i++) {
			System.out.println(s.name[i]+" "+s.marks[i]);
		}
		
	}
}
