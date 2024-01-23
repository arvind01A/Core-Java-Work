package com.nit.hk.collection;

import java.util.Vector;

public class Test07_List_Vector {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		System.out.println(v);
		System.out.println();
		
		System.out.print(v.add("a")); 						System.out.println(" \t\t"+v);
		System.out.print(v.add("b")); 						System.out.println(" \t\t"+v);
		System.out.print(v.add(5)); 							System.out.println(" \t\t"+v);
		System.out.print(v.add(6.7)); 						System.out.println(" \t\t"+v);
		System.out.print(v.add('p')); 						System.out.println(" \t\t"+v);
		System.out.print(v.add(true)); 					System.out.println(" \t\t"+v);
		System.out.print(v.add(null)); 						System.out.println(" \t\t"+v);
		System.out.print(v.add(new Ex(5,6))); 		System.out.println(" \t\t"+v);		
		System.out.print(v.add(null)); 						System.out.println(" \t\t"+v);		
		System.out.print(v.add(null)); 						System.out.println(" \t\t"+v);
		
		System.out.println();
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		
		v.add(8, 5);								 						System.out.println("elem\t\t  :"+v);
		
		System.out.println();
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		System.out.println();
		
		System.out.print(v.contains("a"));				System.out.println("\t\t\t  :"+v);
		System.out.print(v.get(3));							System.out.println("\t\t\t  :"+v);
		
		System.out.print(v.remove(10));				System.out.println("\t\t\t  :"+v);
		
		System.out.println();
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		System.out.println();
		
		System.out.print(v.set(9, "a"));				System.out.println("\t\t\t  :"+v);
		
		System.out.println();
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		System.out.println();
		
		System.out.print(v.indexOf(20));				System.out.println("\t\t\t  :"+v);
		
		System.out.println();
		System.out.println("capacity           :"+v.capacity());
		System.out.println("size                   :"+v.size());
		
	}

}
