package com.collectionframework;

import java.util.*;

public class AboutCollectionsClass {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(20);
		l.add("lakshmi");

//		Collections.addAll(l, "dharani", "sailu", "neeru", "kavya", "sravya", "harish");
		System.out.println(l);

		Collections.sort(l);
		System.out.println(l);

		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);

//		System.out.println(Collections.binarySearch(l, "sailu"));
		List<String> list = new ArrayList<String>(25);

		Collections.copy(list, l);
		System.out.println(list);

	}

}
