package com.strings;

public class StringBufferConstructors {
	public static void main(String[] args) {
//		creating empty stringbuffer with default capacity
		StringBuffer sb=new StringBuffer();
		System.out.println("empty StringBuffer Constructor capacity:"+sb.capacity());
//		creating StringBuffer with intial capacity
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println("StringBuffer Constructor capacity:"+sb1.capacity());
//		for given String creating equivalent string object
		StringBuffer sb2=new StringBuffer("varshi");
		System.out.println("stringbuffer capacity for equivalent string:"+sb2.capacity());
	}
}
