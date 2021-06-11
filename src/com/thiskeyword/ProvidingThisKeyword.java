/*
 * 
Let's prove that this keyword refers to the current class instance variable. 
 */
package com.thiskeyword;

public class ProvidingThisKeyword {
	int rollno;
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String args[]) {
		ProvidingThisKeyword obj = new ProvidingThisKeyword();
		System.out.println(obj);// prints the reference ID
		obj.m();
	}
}
