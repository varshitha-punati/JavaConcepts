package com.innerclass;

public class RegularInnerClass {
//	public static void main(String[] args) {
//		one way
//		OuterClass outerObj=new OuterClass();
//		OuterClass.InnerClass innerObj=outerObj.new InnerClass();
//		innerObj.show();

//		another way
//		new OuterClass().new InnerClass().show();
//		System.out.println(outerObj.getClass().getName());
//		System.out.println(innerObj.getClass().getName());
//	}
}

class OuterClass {

	public void sample() {
		System.out.println("In outerClass sample method");
	}

	class InnerClass {
		synchronized int a;
		{
			System.out.println("Instance block");
		}
//		static {
//			System.out.println("static block");
//		}

	void show() {
			System.out.println("In inner class show method");
		}

	}

	public static void main(String[] args) {
		new OuterClass().new InnerClass().show();

	}
}