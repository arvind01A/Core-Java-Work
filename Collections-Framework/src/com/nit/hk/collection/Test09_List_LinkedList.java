package com.nit.hk.collection;

import java.util.LinkedList;

public class Test09_List_LinkedList {

	public static void main(String[] args) {
		
		NITLinkedList nll = new NITLinkedList();
		
		System.out.println(nll.size());
		System.out.println(nll);
		System.out.println();
		
		nll.add("a");		System.out.println(nll);
		nll.add("b");		System.out.println(nll);
		nll.add(5);			System.out.println(nll);
		nll.add(new Ex(5, 6));			System.out.println(nll);
		nll.add(new Ex(5, 6));			System.out.println(nll);
		
		System.out.println();
		System.out.println(nll.size());
		System.out.println(nll);
		System.out.println();
	}

}
