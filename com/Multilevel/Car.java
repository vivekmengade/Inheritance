package com.Multilevel;

public class Car extends Vehicle{
	String Cartype;
	public Car(String Cartype, String Type) {
	
		this.Cartype=Cartype;
	}
	
	void car() {
		Vehicle a = new Vehicle();
		a.vehicle();
//		System.out.println("this is car");
		System.out.println("this type of car = "+Cartype);
	}
}
