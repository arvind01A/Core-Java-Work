package com.nit.hk.collection;

/*
 * We have 3 types of interfaces are three in Java
 * 	1. Marker interface			-> an empty interface	
 * 	2. Functional interface		-> Single Abstract Method(SAM) interface
 * 	3. Business interface		-> Multiple abstract methods(MAM) interface
 * 
 * - Functional interface is a SAM interface
 * 
 * - It is meant for creating target type for LE 
 *   for enabling functional programming
 *   for passing logic as argument to a method directly
 *   without creating separate class and object.
 *  
 */

//Old style Up to java 7: before functional programming
class Addition {
	void add(int a, int b) {
		System.out.println(a + b);
	}
}

class Calc {
	void calculate(Addition a) {
		a.add(50, 60);
	}
}

public class Test30_FunctionalInterface {
	public static void main(String[] args) {
					Addition a = new Addition();
					a.add(10, 20);
					
					Calc c = new Calc();
					c.calculate(a);
					
					Subtraction s = (int i1, int i2) -> System.out.println(i1 - i2);
					s.sub(10, 20);
	}
}

//New Style Java 8v: by using Functional programming
//by using Functional interface and LE
@FunctionalInterface
interface Subtraction {
	void sub(int a, int b);
}

//==============================================================
@FunctionalInterface
interface I1<T> {	//where ever we need "validate" the passed value or object,
			boolean m1(T t);	 //there we must use this interface
}

@FunctionalInterface
interface I2<T> {	//where ever you need to "consume" the passed value or object
			void v2(T t);		//there we must use this interface
}

@FunctionalInterface
interface I3<T> {	//where ever you need to "supply" a value or an object
			T m3();									//there we must use this interface
}