package com.strings;

import java.util.Scanner;

public class StringFinder {
	 public static void main(String[] args) {
		
	}
	 
	 public String getInput() {
		 Scanner sc=new Scanner(System.in);
		 String searchString=sc.nextLine();
		 String firstString=sc.nextLine();
		 String secondString=sc.nextLine();
		 return null;
	 }
	 public int findString(String  searchString,String firstString,String secondString ) {
		 int j = 0; 
		 int m = searchString.length(); 
	        int n = firstString.length(); 
	        for (int i = 0; i < n && j < m; i++) 
	            if (searchString.charAt(j) == firstString.charAt(i)) 
	                j++; 
	       
		 return 0;
	 }
	 public void displayResult(int result) {
		
		 int result= findString(searchString, firstString, m, n); 
	        if(result) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	 }
}
