package com.SingleInheritance;

public class Square extends Shape{
	static double side;
	double A;
	public Square(double side, String ShapeName, String Color) {
		super(ShapeName,Color);
		this.side=side;
		
	}
	void Area(double side) {
		A=side*side;
		System.out.println("Area Of Square = "+A);
	}
	void Display() {
		System.out.println("Shape Name = "+shapename);
		System.out.println("color = "+color);
		System.out.println("side of Square  = "+side);
		
	}
	public static void main(String[] args) {
		Square a =new Square(12.5 ,"Square","Red");
		a.Display();
		a.Area(side);
	}
	
}
