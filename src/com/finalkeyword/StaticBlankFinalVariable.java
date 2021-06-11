/*static blank final variable
A static final variable that is not initialized at the time of declaration is known as static blank final variable.
 It can be initialized only in static block.
 * 
 */
package com.finalkeyword;

public class StaticBlankFinalVariable {
	
	static final int noOfBooks;// static blank final variable
	static {
		noOfBooks = 50;
	}

	public static void main(String args[]) {
		System.out.println(StaticBlankFinalVariable.noOfBooks);
		
		
	}
}
