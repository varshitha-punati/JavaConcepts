package com.techwave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SolutionOnArraysCount {
	
	public int solution(int[] A) {
	 Arrays.stream(A).collect(ArrayList::new, ArrayList::add, ArrayList::addAll).stream()
				.collect(Collectors.groupingBy(s -> s)).forEach((k, v) -> {
					if (k.equals(1))
						System.out.println(v.size());
				});

		return 0;
	}

	public static void main(String[] args) {
		
		int[] A = { 1, 0,1 };
		SolutionOnArraysCount sc1 = new SolutionOnArraysCount();
		int a=sc1.solution(A);
//		System.out.println(a);
	}
}
