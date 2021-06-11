package com.typecasting;

public class WideningReferencedData {
	public static void main(String[] args) {
		
		Fruit f1=(Fruit)new Citrus();
		Fruit f2=new Citrus();//there is no need of casting opeartor in Widening
		f1.show();
//		f1.show1();
	}
}
class Fruit{
	void show() {
		System.out.println("In super class show...method");
	}
}
class Citrus extends Fruit{
	void show1() {
		System.out.println("In sub class show..method");
	}
}