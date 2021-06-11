package com.innerclass;

public class MethodLocalInnerClasses {
	public static void main(String[] args) {
		MethodLocalInnerClasses obj = new MethodLocalInnerClasses();
		obj.show();

	}

	public void show() {
		System.out.println("In local outer class show method");
		class LocalInnerClasses {
			public void add() {
				System.out.println("Inside LocalInnerClass in add method");
			}
		}
		LocalInnerClasses innerobj = new LocalInnerClasses();
		innerobj.add();
	}
}
