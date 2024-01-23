package com.nit.hk.collection;

import java.util.EnumSet;

enum Color{
	RED, BLUE, GREEN, YELLOW, PINK, BLACK
}
enum Course{
	CORE_JAVA, ADV_JAVA, ORACLE, HTML_CSS_JS, PYTHON
}
enum AccType{
	SAVINGS, CURRENT, NRI
}
enum FoodItem{
	IDLY(35), DOSA(45), WADA(50), PURI(50), BONDA(45), UPMA(40)
	
				;
	
	private double price;
	
	FoodItem(double price) {
		this.price = price;
	}
	
	public double price() {
		return price;
	}
	
}
public class Test06_Set_EnumSet {

	public static void main(String[] args) {
		/*
		System.out.println(FoodItem.IDLY);
		System.out.println(FoodItem.DOSA);
		
		FoodItem[] items = FoodItem.values();
		System.out.println("Sno\t\t\tName\t\t\tPrice");
		System.out.println("======================================");
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i].ordinal()+1 + "\t\t\t");
			System.out.print(items[i].name() + "\t\t\t");
			System.out.println(items[i].price());
		}
		System.out.println("======================================");
		*/
		EnumSet<Color> es1 = EnumSet.noneOf(Color.class);
		EnumSet<Color> es2 = EnumSet.allOf(Color.class);
		EnumSet<Color> es3 = EnumSet.of(Color.BLACK, Color.BLUE, Color.YELLOW);
		EnumSet<Color> es4 = EnumSet.copyOf(es3);
		EnumSet<Color> es5 = EnumSet.complementOf(es3);
		EnumSet<Color> es6 = EnumSet.range(Color.BLUE, Color.PINK);
		
		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		System.out.println(es5);
		System.out.println(es6);
		
	}

}
