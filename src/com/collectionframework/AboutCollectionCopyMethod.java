package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AboutCollectionCopyMethod {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		List<Integer> list1=new ArrayList<Integer>(20);
		list1.add(100);
		list1.add(30);
		Collections.copy(list1, list);
		System.out.println(list1);
	}
}
