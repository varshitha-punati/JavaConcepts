/*
 * overloading is possible for final keyword but overriding is not possible
 *Yes, we can declare the main () method as final in Java. The compiler does not throw any error.

If we declare any method as final by placing the final keyword then that method becomes the final method.
The main use of the final method in Java is they are not overridden.
We can not override final methods in subclasses.
If we are using inheritance and we need some methods not to overridden in subclasses then we need to make it final so that those methods can't be overridden by subclasses.
We can access final methods in the subclass but we can not override final methods.
 */
package com.finalkeyword;

class OnMainMethod {
	public final void show(Object o) {
		System.out.println("BaseClass method");
	}
}

class DerivedClass extends OnMainMethod {
	public void show(Integer i) {
		System.out.println("DerivedClass method");
	}
}

class Test {
	public static final void main(String[] args) { // declaring main () method with final keyword.
		OnMainMethod b = new OnMainMethod();
		DerivedClass d = new DerivedClass();
		b.show(10);
		d.show(new Object());

//	      b.show(new Integer(0));
//	      d.show(new Integer(0));
	}
}
