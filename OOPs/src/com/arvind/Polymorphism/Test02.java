package com.arvind.Polymorphism;
//Develop a program to implement method overriding wise polymorphism for the object Shape.findArea() method

class Shape {
	void findArea() {
		System.out.println();
	}
}

class Rectangle extends Shape {
	private double l;
	private double b;
	
	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}
	
	void findArea() {	//overriding with Rectangle implementation
		System.out.println("Rectangle Area: " + (l*b));
	}
}

class Square extends Shape {
	private double s;
	
	public Square(double s) {
		this.s = s;
	}
	
	void findArea() { //overriding with Square impementation
		System.out.println("Square area: " + (s*s));
	}
}

class Circle extends Shape {
	private static final double PI = 3.14;
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	void findArea() {//overriding with Circle implementation
		System.out.println("Circle area: " + (PI * r * r));
	}
}
public class Test02 {
	public static void main(String[] args) {
		Shape s;
		s = new Rectangle(10, 5);
		s.findArea();
		
		s = new Square(10);
		s.findArea();
		
		s = new Circle(10);
		s.findArea();
		
		System.out.println();
		
		Test02 test = new Test02();
		test.draw(new Rectangle(10, 5));
		test.draw(new Square(10));
		test.draw(new Circle(10));
	}
	
	void draw(Shape s) {	//LC - any of the sub trype can passed and changed
		s.findArea(); 		//RP - executes from the sub class whose object is passed
	}
}
