/*
 * final cannot be applied to constructors
 */

package com.finalkeyword;

public class OnConstructors {
	
	String name;
	int age;
	
	OnConstructors(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		OnConstructors c=new OnConstructors("nadendla",200);
		
	}
	
}
