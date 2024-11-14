package com.SingleInheritance;

public class Employee extends Citizen{
	int Empid;
	long Salary;
	
	void DisplayEmployee() {
		System.out.println("Name of Employee "+name);
		System.out.println("Adhar no. "+Adharno);
		System.out.println("State "+State);
		System.out.println("Employee ID = "+Empid);
		System.out.println("Salary = "+Salary);
		
	}
}
