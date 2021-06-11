/* 
Real usage of this() constructor call
The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. Let's see the example
 given below that displays the actual use of this keyword.
 *
 */
package com.thiskeyword;

public class ConstructorUsingThisKeyword {
	int rollNo;
	String name;
	float fee;
	
	ConstructorUsingThisKeyword(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	ConstructorUsingThisKeyword(int rollNo,String name,float fee){
		this(rollNo,name);
		this.fee=fee;
	}
	void display(){
		System.out.println(rollNo+" "+name+" "+fee);
		}  
	public static void main(String[] args) {
		ConstructorUsingThisKeyword c=new ConstructorUsingThisKeyword(571,"sravani",10000.04f);
		ConstructorUsingThisKeyword c1=new ConstructorUsingThisKeyword(572,"vani");
		c.display();
		c1.display();
	}
	
	
}
