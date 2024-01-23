package com.nit.hk.collection;

import java.util.ArrayList;

public class Test08_List_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		System.out.println(al);
		System.out.println();
		
		System.out.print(al.add("a")); 						System.out.println(" \t\t"+al);
		System.out.print(al.add("b")); 						System.out.println(" \t\t"+al);
		System.out.print(al.add(5)); 							System.out.println(" \t\t"+al);
		System.out.print(al.add(6.7)); 						System.out.println(" \t\t"+al);
		System.out.print(al.add('p')); 						System.out.println(" \t\t"+al);
		System.out.print(al.add(true)); 					System.out.println(" \t\t"+al);
		System.out.print(al.add(null)); 						System.out.println(" \t\t"+al);
		System.out.print(al.add(new Ex(5,6))); 		System.out.println(" \t\t"+al);		
		System.out.print(al.add(null)); 						System.out.println(" \t\t"+al);		
		System.out.print(al.add(null)); 						System.out.println(" \t\t"+al);
		
		System.out.println();
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		
		al.add(8, 5);								 						System.out.println("elem\t\t  :"+al);
		
		System.out.println();
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		System.out.println();
		
		System.out.print(al.contains("a"));				System.out.println("\t\t\t  :"+al);
		System.out.print(al.get(3));							System.out.println("\t\t\t  :"+al);
		
		System.out.print(al.remove(10));				System.out.println("\t\t\t  :"+al);
		
		System.out.println();
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		System.out.println();
		
		System.out.print(al.set(9, "a"));				System.out.println("\t\t\t  :"+al);
		
		System.out.println();
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		System.out.println();
		
		System.out.print(al.indexOf(20));				System.out.println("\t\t\t  :"+al);
		
		System.out.println();
		//System.out.println("capacity           :"+al.capacity());
		System.out.println("size                   :"+al.size());
		
	}

}
