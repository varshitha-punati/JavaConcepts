package com.strings;

import java.util.Scanner;

public class Gmail {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail id:");
		String mailId=sc.next();
		System.out.println("enter password:");
		String pswd=sc.next();
		if(mailId.equalsIgnoreCase("java@gmail.com")) {
			if(pswd.equals("JAVA123")) {
				System.out.println("login Successful");
			}
			else {
				System.out.println("password is incorrect");
			}
		}
		
	}
}
