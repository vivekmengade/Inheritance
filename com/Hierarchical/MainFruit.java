package com.Hierarchical;

public class MainFruit {
	public static void main(String[] args) {
		Mango m = new Mango("Sweet","Kokan","Mango","Yellow");
		m.DisplayMango();
		System.out.println("--------------------");
		Apple a = new Apple("Sweet","Kashmir","Apple","Red");
		a.DisplayApple();
		System.out.println("--------------------");
		Orange o = new Orange("Sweet","Satara","Orange","Orange");
		o.DisplayOrange();
	}
	
}
