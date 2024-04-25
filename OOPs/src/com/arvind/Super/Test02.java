package com.arvind.Super;

class Example {

	Example(){
		System.out.println("Example()");
	}
	Example(int x){
		System.out.println("Example(int)");
	}
}
class Sample extends Example {
	Sample(){
		//super() default call if not write then compiler placed super()
		System.out.println("Sample()");
	}
	Sample(int x){
		//super()	default call if not write then compiler placed super()
		System.out.println("Sample(int)");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
	}
}
