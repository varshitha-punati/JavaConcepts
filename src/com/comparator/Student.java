package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int age;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	Student(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	

	@Override
	public int compareTo(Student ss) {
		// TODO Auto-generated method stub
		if(this.getAge()<ss.getAge()) {
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}
class Main{
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(256,11,"abc"));
		al.add(new Student(456,17,"ijk"));
		al.add(new Student(356,14,"xyz"));
		 Collections.sort(al);
		 
	        System.out.println("Movies after sorting : ");
	        for (Student s: al)
	        {
	            System.out.println(s.getName() + " " +
	                               s.getId() + " " +
	                               s.getAge());
	        }
	}
}
