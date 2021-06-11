package com.techwave;

import java.util.Arrays;

public class SolutionOnArrays {

	public int solution(int[] A) {

		Arrays.sort(A);
		int i = 1;
		for (int j = 0; j < A.length; j++) {
			if (A[j] == i) {
				i++;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		
		int[] A = { 1, 3, 6, 4, 1, 2 };
//		int[] A= {1,2,3};
//		int[] A = { -1, -3 };
		
		SolutionOnArrays s = new SolutionOnArrays();

		int missing = s.solution(A);
		System.out.println(missing);

	}

}
