/*) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. 
If you don't use the this keyword,
 compiler automatically adds this keyword while invoking the method.

 * 
 */
package com.thiskeyword;

public class MethodsUsingThisKeyword {
	
	void read() {
		System.out.println("it is reading");
	}

	public void write() {
		System.out.println("it is writing");
		this.read();
	}

}

class Run {
	public static void main(String[] args) {
		MethodsUsingThisKeyword m = new MethodsUsingThisKeyword();
		m.write();
	}
}
