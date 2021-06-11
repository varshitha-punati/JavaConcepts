package com.variables;


public class alphabet
{
  public static void main(String[] args) {
    String name="varshitha@123";
    int count=0;
    if(true) {
    	System.out.println("varshi");
    }
    for (int i=0;i<name.length();i++)
    {
       if(Character.isLetter(name.charAt(i)))
    	   count++;
    }
    System.out.println("the number of alphabets in the given string is:"+count);
  }
}