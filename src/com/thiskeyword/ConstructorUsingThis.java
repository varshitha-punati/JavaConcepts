/*
 * 3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. 
It is used to reuse the constructor. 
In other words, it is used for constructor chaining.
 */
package com.thiskeyword;

public class ConstructorUsingThis {
	String name;
	
	ConstructorUsingThis(){
		System.out.println("printing the name:");
	}
	ConstructorUsingThis(String name){
		new ConstructorUsingThis();
//		this();
		System.out.println(name);
	}
	public static void main(String[] args) {
		ConstructorUsingThis c=new ConstructorUsingThis("Anoohya");
		
	}
}
