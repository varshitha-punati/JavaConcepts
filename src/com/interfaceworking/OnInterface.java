package com.interfaceworking;

public abstract class OnInterface implements DrawDiagrams {

//	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("circle is drawn");
	}
	abstract void space();
	public static void main(String[] args) {
////		OnInterface obj=new OnInterface();
//		obj.circle();
		DrawDiagrams.square();
		DrawDiagrams.rectangle();
//		DrawDiagrams.hexagon();private method cannot be accessed in interface methods
	}
}
 class   sample2 extends OnInterface1{

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void circle() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void space() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
abstract class OnInterface1 implements DrawDiagrams {

//	@Override
//	public void circle() {
//		// TODO Auto-generated method stub
//		System.out.println("circle is drawn");
//	}
//
}
interface DrawDiagrams{
	
	
	//we cannot create constructor for interface
	
	//variables
	int a = 0;
	static int b=10;
	final int c=15;
	
	void circle();
//	private abstract void line();
//	not accessable
	
	//concrete methods
	public static void rectangle() {
		System.out.println("Rectangle is drawn");
	}
	default void a() {
		
	}
	public static void square() {
		System.out.println("square is drawn");
	}
	
	private static void hexagon() { 
		System.out.println("Hexagon is drawn");
	}
//	public static void main(String[] args) {
////		OnInterface obj=new OnInterface();
////		obj.circle();
//		square();
//		rectangle();
//		hexagon();
////		private method cannot be accessed in inetface methods
//	}
	public static void main(String[] args) {
		OnInterface obj=new OnInterface();
		obj.circle();
		DrawDiagrams.square();
		DrawDiagrams.rectangle();
//		DrawDiagrams.hexagon();private method cannot be accessed in interface methods
//	}
}
// interface sample extends 