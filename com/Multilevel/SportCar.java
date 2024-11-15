package com.Multilevel;

public class SportCar extends Car{
	int id;
	public SportCar(int id , String car){
	
	}
	void sportcar() {
		Car s = new Car();
		s.car();
//		System.out.println("this is sport car");
		System.out.println("this is car ID = " +id);
	}
}
