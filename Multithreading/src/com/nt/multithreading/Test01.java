package com.nt.multithreading;
/*
 * - In this chapter we will learn 
 * 	 running a project operations concurrently
 * 
 * - Till now we have learnt running programs sequentially
 * 
 * - the problem in sequential flow of execution
 *   time taking process. If one of the operations execution
 *   is paused, then other operations execution is also paused
 *   
 * - to use CPU ideal time effectively and to run other 
 *   independent operations concurrently in complete
 *   project execution in less time, we must use multi threading 
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");
		Example.m1();
		Example.m2();
		Example.m3();
		System.out.println("main end");
	}
}
