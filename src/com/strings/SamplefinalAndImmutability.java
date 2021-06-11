package com.strings;

public class SamplefinalAndImmutability {
	public static void main(String[] args)
    {
        final StringBuffer sb = new StringBuffer("varshi");
  
        // Even though reference varibale sb is final
        // We can perform any changes
        sb.append("software");
  
        System.out.println(sb);
  
        // Here we will get Compile time error
        // Because reassignment is not possible for final variable
        sb1 = new StringBuffer("Hello World");
  
        System.out.println(sb);
    }
}
