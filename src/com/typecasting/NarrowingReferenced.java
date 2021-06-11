package com.typecasting;

public class NarrowingReferenced {
	public static void main(String[] args) {
		Citruses cs=(Citruses) new Fruits();
		cs.show();
		cs.show1();
	}
}
class Fruits{
	void show() {
		System.out.println("In super class show...method");
	}
}
class Citruses extends Fruits{
	void show1() {
		System.out.println("In sub class show..method");
	}
}
