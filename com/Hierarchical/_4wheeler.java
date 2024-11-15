package com.Hierarchical;

public class _4wheeler extends Vehicle {
	int milage;
	String vno;
	public _4wheeler(int m, String vn, String n, String b, String t){
		super(n,b,t);
		this.milage=m;
		this.vno=vn;
	}
	void showfour() {
		super.showvehicle();
		System.out.println("milage of vehicle = "+milage);
		System.out.println("vehicle no = "+vno);
	}
}
