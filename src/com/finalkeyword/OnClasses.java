/*
 * if a class is declared as final then that class cannot
 *  be extended by other class
 */

package com.finalkeyword;

public final class OnClasses {
	public static void main(String[] args) {
		OnClasses c=new OnClasses();
		System.out.println("final class main method");
	}
}
//class ChildClass extends OnClasses{
//	
//}