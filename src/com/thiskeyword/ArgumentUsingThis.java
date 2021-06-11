/*
 * this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also.
 It is useful if we have to use one object in multiple classes. 
 *
 */
package com.thiskeyword;

public class ArgumentUsingThis {

	Sample obj;

	ArgumentUsingThis(Sample obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of Sample class
	}
}

class Sample {
	int data = 10;

	Sample() {
		ArgumentUsingThis b = new ArgumentUsingThis(this);
		b.display();
	}

	public static void main(String args[]) {
		Sample a = new Sample();
		
		
		
	}
}
