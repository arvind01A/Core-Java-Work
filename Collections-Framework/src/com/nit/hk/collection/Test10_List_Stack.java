package com.nit.hk.collection;

import java.util.Stack;

public class Test10_List_Stack {

	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<>();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println();
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();
		
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();
		
		stack.add(5);
		System.out.println(stack);
		System.out.println();
		
		Object obj = stack.get(2);
		System.out.println(obj);
	}

}
