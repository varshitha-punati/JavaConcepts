package com.accessability;
import com.wrapperclases.*;
public class Fiz extends foo{
	public static void main(String[] args) {
		foo  f=new foo();
		System.out.println(" "+f.a);
		System.out.println(" "+f.b);
		System.out.println(" "+new Fiz().a);
		System.out.println(" "+new Fiz().b);
	}
}
