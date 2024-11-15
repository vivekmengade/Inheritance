package com.SingleInheritance;

public class Student extends Person{
	int id;
	double per;
	
	public Student(int id, double per, int age, String name) {
		super(age,name);
		this.id=id;
		this.per=per;
	}
	
	void StudentDisplay() {
		System.out.println("name = "+name);
		System.out.println("id = "+id);
		System.out.println("percentage = "+per);
		System.out.println("Age = "+age);
	}
}
