package com.innerclass;
 class AnonymousInnerClass {
	 {
		 System.out.println("Instance blocks");
	 }
	 static {
		 System.out.println("static block");
	 }
	  static void sample() {
		 
	 }
	 
	public static void main(String[] args) {
		Age obj=new Age() {
			public void show() {
				System.out.println("In anonymous class in show method");
			}
			
		};
		obj.show();		
		AnonymousInnerClass ac=new AnonymousInnerClass();
		Age obj1=new Age();
		obj1.display();
	}
}
class Age{
	public void show() {
		System.out.println("In show method");
	}
	public void display() {
		System.out.println("In normal class in display method");
	}
}