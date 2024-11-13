package com.SingleInheritance;

public class Owner extends Instu{
	public String ownName;
	public int ownage;
	public double Pryr;
	void DisplayOwner() {
		System.out.println("owner name "+this.ownName);
		System.out.println("owner AGE "+this.ownage);
		System.out.println("Profit per YR "+this.Pryr);
		System.out.println("institute ID "+id);
		System.out.println("institute Name "+name);
		System.out.println("institute Year"+yr);
	}
}
