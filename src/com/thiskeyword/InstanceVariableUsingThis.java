/*
 * 1) this: to refer current class instance variable
The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters,
 this keyword resolves the problem of ambiguity.
 */

package com.thiskeyword;

public class InstanceVariableUsingThis {
	
	int rollNo;
	String name;
	
	InstanceVariableUsingThis(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	void display() {
		System.out.println(rollNo+" "+name);
	}
	
	public static void main(String[] args) {
		InstanceVariableUsingThis i=new InstanceVariableUsingThis(572,"swapna");
		InstanceVariableUsingThis iv=new InstanceVariableUsingThis(574,"manisha");
		i.display();
		iv.display();
	}
}
