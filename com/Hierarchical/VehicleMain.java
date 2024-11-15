package com.Hierarchical;

public class VehicleMain {
	public static void main(String[] args) {
		_2wheeler t = new _2wheeler(46, "MH12 KM 3005","Chetak","BAJAJ","scooter");
		t.two();
		System.out.println("----------------------");
		_4wheeler f = new _4wheeler(66, "MH14 KM 5005","alto","SUSZUKI","SUV");
		f.showfour();
	}
}
