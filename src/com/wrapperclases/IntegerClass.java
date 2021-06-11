package com.wrapperclases;

public class IntegerClass {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		Integer iz = Integer.valueOf("10");
		Integer ik = Integer.valueOf("10");
		System.out.println(iz.equals(ik));
		Short s = Short.valueOf("12");
		Byte by = Byte.valueOf("3");
		Integer i2 = Integer.valueOf(10);
		Long lg = Long.valueOf(1200);
		Float fl = Float.valueOf(12.0f);
	

	}
}
