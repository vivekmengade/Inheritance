package com.SingleInheritance;

public class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	
	void DisplayPerson() {
		System.out.println(this.age);
		System.out.println(this.name);
//		System.out.println(this.Address);
	}
}
