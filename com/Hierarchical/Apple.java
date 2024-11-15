package com.Hierarchical;

public class Apple extends Fruit {
	String taste;
	String loc;
	public Apple(String taste, String loc, String n, String c) {
		super(n,c);
		this.taste=taste;
		this.loc=loc;
		
	}
	void DisplayApple() {
		System.out.println("Name of Fruit = "+Name);
		System.out.println("color of Fruit = "+color);
		System.out.println("location of fruit = "+loc);
		System.out.println("Taste of Fruit = "+taste);
		
	}
}
