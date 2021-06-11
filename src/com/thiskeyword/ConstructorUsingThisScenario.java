package com.thiskeyword;

public class ConstructorUsingThisScenario {
	String name;
	ConstructorUsingThisScenario(String name){
		System.out.println(name);
	}
	ConstructorUsingThisScenario(){
		this("sravya");
	}
	public static void main(String[] args) {
		ConstructorUsingThisScenario c=new ConstructorUsingThisScenario();
	}
	
}
