package com.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

	int marks[][];

	public static void main(String[] args) {
		TwoDimensionalArray t = new TwoDimensionalArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		System.out.println("enter size1");
		int size1 = sc.nextInt();
		t.marks = new int[size][size1];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size1; j++) {
				System.out.println("enter marks");
				int marks = sc.nextInt();
				t.marks[i][j] = marks;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size1; j++) {
				System.out.print(t.marks[i][j] + " ");

			}
			System.out.println();
		}
	}
}
