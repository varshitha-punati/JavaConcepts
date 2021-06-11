/*
 * cannot override static,instance and local varaibles
 * instance varaibles,local variables ,static variables can be final
s * final variables must need to intialize
 */
package com.finalkeyword;

public class OnFinalVaraibles {
	
	final int noOfStudents=10;
	
	final static String name="sravya";
	
	public static void main(String[] args) {
		final int age=20;
		
		OnFinalVaraibles f=new OnFinalVaraibles();
		System.out.println(f.noOfStudents);
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
}
