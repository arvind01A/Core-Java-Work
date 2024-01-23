package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test21_get {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");   	//0
		al.add(5);     	//1     
		al.add("b");	//2
		al.add(6);		//3
		al.add("c");	//4	
		al.add(7);		//5
		
		System.out.println(al);
		
		//We can retrieve objects in two ways
		/*	
			1. Randomly
			2. Sequentially
		*/
		
		//random access	
			System.out.println(al.get(0));
			System.out.println(al.get(4));
			System.out.println(al.get(3));
			System.out.println(al.get(2));
			System.out.println();
		
		//sequentially
			System.out.println(al.get(0));			//static nature code
			System.out.println(al.get(1));
			System.out.println(al.get(2));
			System.out.println(al.get(3));
			System.out.println(al.get(4));
			System.out.println(al.get(5));
			System.out.println();
			
			for (int i = 0; i < al.size(); i++) {			//dynamic nature code
				System.out.println(al.get(i));
			}
			System.out.println();
			
		//rules 
			//Rule #1: the index [>=0 && <size()] else RE: IOOBE
				//System.out.println(al.get(-1)); 	//RE: IOOBE
				//System.out.println(al.get(6));	//RE: IOOBE
				System.out.println(al.get(0));		
				System.out.println(al.get(5));
				
				//for (int i = 0; i <= al.size(); i++) {			//values + IOOBE
				//for (int i = 0; i <= al.size()-1; i++) {		//values 
				for (int i = 0; i < al.size()-1; i++) {				//last values is missed 
					System.out.print(al.get(i) + " ");
				}
				System.out.println();
				
			//Rule #2: We can not assign the returned object to its own type
			//because get() method return type is Object, 
			//because al is type is ArrayList<Object>
			//it leads to CE: i c t.
				
			//We must assign it to Object type variable
				
				//String s  =  al.get(0);
				Object obj = al.get(0);
				System.out.println(obj);
			
			//Rule #3: we can invoke the returned object specific methods
			//by using Object type variable, it leads CE: c f s
			
			//we must type cast the returned object to its own type
				
				//System.out.println(obj.toUpperCase());
				//String s = (String)obj;		//it may leads CCE: if 0 index obj is not String type
				//System.out.println(s);

			//Rule #4: We must type cast object inside if(instanceof) condition
				if(obj instanceof String) {
					String s = (String)obj;
					System.out.println(s.toUpperCase());
				}
				
				if(obj instanceof String s) {	//Java 14 style
					System.out.println(s.toUpperCase());
				}
				System.out.println();
		
		//Rule #5: we can not use get() method with Set
		//because Set does not have index
			
			LinkedHashSet<Object> lhs = new LinkedHashSet<>();
			lhs.add("a");
			lhs.add(5);
			System.out.println(lhs);

			//System.out.println(lhs.get(0)); CE: c f s
			
	//for retrieving objects from Set, we must use Cursor objects	
			/*
			 * 1. Enumeration or
			 * 2. Iterator or
			 * 3. ListIterator or
			 * 4. for-each loop or
			 * 5. forEach(-) method or
			 * 6. Stream API or
			 * 7. Spliterator or
			 */
	}
}
