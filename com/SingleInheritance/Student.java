package com.SingleInheritance;

public class Student extends Person{
	int id;
	double per;
	
	void StudentDisplay() {
		System.out.println("name = "+name);
		System.out.println("id = "+id);
		System.out.println("percentage = "+per);
		System.out.println("Age = "+age);
	}
}
