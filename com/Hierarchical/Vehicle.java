package com.Hierarchical;


//hierarchical inheritance
public class Vehicle {
	
	String Name;
	String Brand;
	String Type;
	
	public Vehicle(String name, String brand, String type) {
		this.Name=name;
		this.Brand=brand;
		this.Type=type; 
	}
	void showvehicle(){
		System.out.println("name of vehicle = "+this.Name);
		System.out.println("brand of vehicle = "+this.Brand);
		System.out.println("type of vehicle = "+this.Type);
	}
}
