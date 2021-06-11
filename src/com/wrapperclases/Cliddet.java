package com.wrapperclases;

class Clidder {
private final void flipper() {
	System.out.println("Clidder");
}
}
public class Cliddet extends Clidder{
	private final void flipper() {
		System.out.println("Clidlet");
	}
	public static void main(String[] args) {
		new Cliddet().flipper();
	}
	}
