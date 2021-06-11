package com.strings;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your cityName");
		String name=sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad")) {
			System.out.println("Hi Hyderabadians");
		}
		else if(name.equals("chennai")) {
			System.out.println("Hello madrasian");
		}
		else if(name.equals("banglore")) {
			System.out.println("hii banglore");
		}
		else {
			System.out.println("Must use valid city name");
		}
	}
}
