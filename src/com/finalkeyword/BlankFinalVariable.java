/*
 * 
 * blank or uninitialized final variable:
 * 
 * A final variable that is not initialized at the time of declaration is known as blank final variable.
 *the variable can be intialized with constructor
 *If you want to create a variable that is initialized at the time of creating object and once 
 *initialized may not be changed, it is useful. 
 *By using instance block also we can intialize the constructor
 */
package com.finalkeyword;

public class BlankFinalVariable {
	
	final int balance;//blank final variables
	
	BlankFinalVariable(int balance){
		this.balance=balance;
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		BlankFinalVariable b=new BlankFinalVariable(100);
	
		BlankFinalVariable b1=new BlankFinalVariable(200);
	}
}
