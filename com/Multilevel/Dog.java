package com.Multilevel;

public class Dog extends Mammel{
	int age;
	void bark() {
		System.out.println("Dog is barking Continuesly");
		
	}
	void Display() {
		Dog a = new Dog();
		a.bark();
		a.run();
		a.eat();
	}

}
