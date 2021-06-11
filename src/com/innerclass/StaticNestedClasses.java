/*Static Nested classes:
 * In static Inner class we can't access the instance variables.
 * A Inner class that is declared with static keyword is called static nested classes
 */
package com.innerclass;

class StaticNestedClasses {
	
//	static variable
	static String name="varshitha";
	
//	Instance variable
	int a=10;
	
//	non-static method
	public void msg() {
		System.out.println("mesage in outer class");
	}
	
	static class InnerClass {

		public void msg() {
//			System.out.println(a);
			System.out.println(name);
			System.out.println("message in inner class");
			
		}
		
		public static void main(String[] args) {

			StaticNestedClasses.InnerClass obj = new StaticNestedClasses.InnerClass();
			obj.msg();
			
			

		}
	}

	
}
