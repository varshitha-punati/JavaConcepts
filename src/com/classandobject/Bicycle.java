package com.classandobject;

public class Bicycle {
	
//	properties
	int tier;
	int seats;
	int brakes;
	String clolur;
	
//	actions
	void move() {
		System.out.println("moving");
	}
	void stop() {
		System.out.println("stop");
	}
	
	
	public static void main(String[] args) {
		
//		objects
		Bicycle  evil=new Bicycle();
		Bicycle  specialized=new Bicycle();
		
//		invoking methods with object reference
		evil.move();
		specialized.stop();
		
	}
}

