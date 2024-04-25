package com.arvind.Polymorphism;
//Develop a program to implement method overloading based polymorphism
//Define add method in Addition class for adding diff type and diff list of passed values

class Addition {
	void add(int i1, int i2) {
		System.out.println("2 ints: " + (i1 + i2));
	}
	
	void add(int i1, int i2, int i3) {
		System.out.println("3 ints: " + (i1 + i2 + i3));		
	}
	
	void add(float f1, float f2) {
		System.out.println("float, float: " + (f1 + f2));
	}
	
	void add(int i1, float f1) {
		System.out.println("int, flaot: " + (i1 + f1));
	}
	
	void add(float f1, float f2, int i1) {
		System.out.println("float, int " + (f1 + i1));
	}
}

class AdditionSub extends Addition {
	void add(String s1, String s2) {	//overloading
		System.out.println("S, S: " + (s1 + s2));
	}
	
	void add(int i1, int i2) { //overriding
		int i3 = i1 + i2;
		System.out.printf("The addition of %d and %d is %d \n" , i1, i2, i3);
	}
	
	static void add(float f1, int i1) {
		float f2 = f1 + i1;
		System.out.printf("The addition of %f and %d is %f \n" , f1, i1, f2);		
	}
}
public class Test03 {	//suppous this class is cal (main) class
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(5, 6);
		a.add(5, 6, 7);
		System.out.println();
		
		a.add(10.5f, 10.6f);
		a.add(5, 6f);
		a.add(6F, 5);
		System.out.println();
		
		AdditionSub as = new AdditionSub();
		as.add(10, 20);
		as.add(10, 20F);
		as.add(10F, 20);
		as.add("A", "K");
		System.out.println();
		
		Addition a2 = new AdditionSub();
		a2.add(10, 20);
		a2.add(10, 20F);
		a2.add(10F, 20);
		//a2.add("A", "K");		//CE
	}
}
