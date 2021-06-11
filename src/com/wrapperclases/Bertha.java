package com.wrapperclases;

public class Bertha {
	static String s=" ";
	public static void main(String[] args) {
		int X=4;
		Boolean y=true;
		short[] sa= {1,2,3};
		doStuff(X,y);
		doStuff(X);
		doStuff(sa,sa);
		System.out.println(s);
	}
	static void doStuff(Object o) {
		s+="1";
	}
	static void doStuff(Object...o) {
		s+="2";
	}
	static void doStuff(Integer...i) {
		s+="3";
	}
	static void doStuff(Long l) {
		s+="4";
	}
}
