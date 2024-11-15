package com.Hierarchical;

public class _2wheeler extends Vehicle{
	int milage;
	String vno;
	
	public _2wheeler(int m, String vn, String n, String b, String t){
		super(n,b,t);
		this.milage=m;
		this.vno=vn;
	}
	void two() {
		super.showvehicle();
		System.out.println("milage of vehicle = "+milage);
		System.out.println("vehicle no = "+vno);
	}
}
