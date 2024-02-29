package com.nt.String;

//mutable class
class A {
	private int x;
	private int y;
	
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
}

public class Test04_TypesOfImmutableObjects {
	public static void main(String[] args) {
		
		A a1 = new A(10, 20);
		System.out.println(a1);
		
		a1.setX(15);
		a1.setY(16);
		System.out.println(a1);		//mutable object
														//data is changed in same 
														//current object a1
		System.out.println();
		
		B b1 = new B(10, 20);			//immutable object
		System.out.println(b1);		//does not accept modification
		System.out.println();
		
		C c1 = new C(10, 20);							//immutable object
		System.out.println("c1: " + c1);		//accepts modifications
		
		c1.modifyByAdding(15, 16);
		System.out.println("c1: " + c1);
		
		C c2 = c1.modifyByAdding(15, 16);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println();
		
		String s1 = "abc";			//String is an immutable object
		
		s1.concat(" cbc");	  			//returns modifications as new Object
		System.out.println(s1);		//s1 is still pointing to old object
		
		String s2 = s1.concat(" cbc");	//returns modifications as new Object
		System.out.println(s1);				//s1 is still pointing to old object
		System.out.println(s2);
		
		Integer io1 = 500;					//WC integer is immutable object
		System.out.println(io1);		//does not accept modifications
		
		String s3 = "AK";
		s3 = "Nit";
		System.out.println(s3);
		
		final String s4 = "Hyd";
		//s4 = "sec";
	}
}

//immutable object class without accepting modifications
final class B {
	private final int x;		//mandatory
	private final int y;
	
	public B(int x, int y) {		//mandatory
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + "]";
	}
	
}

//immutable object class, 
//accepts modifications, 
//and returns result as new object
final class C {
	private final int x;		//mandatory
	private final int y;
	
	public C(int x, int y) {		//mandatory
		this.x = x;
		this.y = y;
	}
	
	public C modifyByAdding(int x, int y) {
		C c = new C((this.x + x), (this.y + y));		//modifying in new object
		return c;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "C [x=" + x + ", y=" + y + "]";
	}
	
}