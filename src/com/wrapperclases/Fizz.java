package com.wrapperclases;

public class Fizz {
	public static void main(String[] args) {
		int X=5;
		final Fizz f1=new Fizz();
		Fizz f2=new Fizz();
		Fizz f3=new FizzSwitch(f1,f2);
		System.out.println((f1===f3)+" "+(f1.x==f3.x));
		
	}
}
