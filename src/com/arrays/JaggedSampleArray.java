package com.arrays;

import java.util.Scanner;

public class JaggedSampleArray {
	int a1[];
	int a2[];
	int a3[];
	int a[][]= {a1,a2,a3};
	public static void main(String[] args) {
		JaggedSampleArray sample=new JaggedSampleArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter size1");
		int size1=sc.nextInt();
		System.out.println("enter size2");
		int size2=sc.nextInt();
		sample.a1=new int[size];
		sample.a2=new int[size1];
		sample.a3=new int[size2];
		
		for(int i=0;i<sample.a1.length;i++) {
			System.out.println("Enter Name:");
			int a1=sc.nextInt();
			sample.a1[i]=a1;
		}
		for(int i=0;i<sample.a2.length;i++) {
			System.out.println("Enter Name:");
			int a2=sc.nextInt();
			sample.a2[i]=a2;
		}
		for(int i=0;i<sample.a3.length;i++) {
			System.out.println("Enter Name:");
			int a3=sc.nextInt();
			sample.a3[i]=a3;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sample.a[i][j] + " ");

			}
			System.out.println();
		}
	}
}
