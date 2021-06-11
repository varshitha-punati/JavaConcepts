package com.variablesexamples;

public class StaticVariables {

	static int NoOfStudents;
	

	int StudentWeight;
	int StudentHeight;

	StaticVariables(int StudentWeight, int StudentHeight) {
		this.StudentWeight = StudentWeight;
		this.StudentHeight = StudentHeight;
	}

	public static void main(String[] args) {
		
		NoOfStudents = 50;
		
		StaticVariables student1 = new StaticVariables(60, 5);
		
		System.out.println("student 1");
		System.out.println("no:of students" + student1.NoOfStudents + "studentweight" + student1.StudentWeight
				+ "studentHeight" + student1.StudentHeight);

		StaticVariables student2 = new StaticVariables(80, 4);
		NoOfStudents = 100;
		System.out.println("student 2:");
		System.out.println("no:of students" + student2.NoOfStudents + "studentweight" + student2.StudentWeight
				+ "studentHeight" + student2.StudentHeight);
		
		StaticVariables student3 = new StaticVariables(100, 6);
		System.out.println("student 3:");
		System.out.println("no:of students" + student3.NoOfStudents + "studentweight" + student3.StudentWeight
				+ "studentHeight" + student3.StudentHeight);
		for(int i=1;i<4;i++) {
			System.out.println(i);
		}
		
	}
}
