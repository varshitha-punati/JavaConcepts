package com.variables;
/*constructor should be same as class name
 * constructor should not contain any return type
 * constructor is used to intialise values to instance (object)
 * At the time of object creation we are assingning values to instance variables
 *
 *types of consturctor
 *1.default/no argumnet constructor
 *2.parametrized constructor
 *
 *memory allocation->
 *instance variable,instance blocks,instance methods
 *instance->id->0,name->null(default consturctor)
 *instance->id->12,name->yashu(paremetrized )
 *constructor overloading is possible in java
 *consturctor chaining
 */

public class OnConstructors {

	int studentId;
	String studentName;
	
	 OnConstructors(){
		System.out.println("default constuctor");
		
		new OnConstructors(12);
	}
	OnConstructors(int studentId){
		
		this.studentId=studentId;
		
		System.out.println("default constuctor");
		new OnConstructors();
	}
	
	OnConstructors(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;

	}
	
	
	
	
	
	public static void main(String[] args) {
		OnConstructors s=new OnConstructors();
	}

}
