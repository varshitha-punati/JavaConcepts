package com.innerclass;

public class InnerClassScenario1 {

}
class Google{
	public static void method1() {
		System.out.println("Outer class non-static method");
	}
	 class Youtube{
		public void method2() {
			System.out.println("Inner class non-static method");
		}
		  
	}
	
	public static void main(String[] args) {
		
//	1.Accessability scope of InnerClass Methods through outer class reference
		
		Google g=new Google();
//		g.method2();
//		we cann't access inner class method through outer class refernce 
		
//	2. Accessability scope of InnerClass Methods through outer class reference
		
		Google.Youtube y=g.new Youtube();
//		y.method1();
//		we can't access outer class method through inner class reference
		
		
	}
}