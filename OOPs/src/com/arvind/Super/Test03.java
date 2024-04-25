package com.arvind.Super;

class Example1 {
	Example1(int x){
		System.out.println("Example(int)");
	}
}
class Sample1 extends Example1 {
	Sample1(){
		super(10);
		System.out.println("Sample1()");
	}
	Sample1(int x) {
		super(10);
		System.out.println("Sample1(int)");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1(10);
	}
}
