package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Test28_foreachloop {
	public static void main(String[] args) {
					ArrayList<Object> al = new ArrayList<>();
					
					al.add("a1");
					al.add(51);
					al.add("b1");
					al.add(61);
					al.add("c1");
					al.add(71);
					
					Iterator<Object> itr = al.iterator();
					while(itr.hasNext()) {
						Object obj = itr.next();
						System.out.println(obj);
					}
					System.out.println();
					
	//Enhanced for loop (or) for-each loop
					//for( var dec : (array/Iterable) obj ) {
									//blogic	
					//}
					
					for(Object obj : al) {
						if(obj instanceof String s )
							System.out.println(s.toUpperCase());
						else 
							System.out.println(obj);
					}
					System.out.println();
					
								/*
								 * 			 								  ||
								 * 											\||/
								 * 	for(Iterator<Object> itr=al.iterator(); itr.hasNext(); ) {
								 * 		Object obj=itr.next();
								 * 
								 * 		if(obj instanceof String s) 
								 * 			Sytem.out.println(s.toUpperCase());
								 * 		else
								 * 			Sytem.out.println(obj);
								 * }
								 */	
					
					//Rules on enhanced for loop
					//Rule #1: the variable type must be the itr.next() return type
									//or its super class type
					
									ArrayList<String> al2 = new ArrayList<>();
									for(String s : al2) {	}
									for(Object obj : al2) { }
									//for(Integer in : al2) { }
									
				   //Rule #2: The object type must be an array or Iterable type
									String s1 = "Hari";
									//for(char ch : s1) { }		 // String is not Iterable type
									
									String[] sa = new String[5];
									for(String s : sa) { }
									
									int i1 = 12345;
									//for(int val : i1) { }
									
									int[] ia = {1, 2, 3, 4, 5};
									for(int val : ia) { }
									
									for(String s : al2) { }
										
									Iterator<String> itr2 = al2.iterator();
									//for(String s : itr2) { }
									
									LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
									for(int i : lhs) { }
									
									LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
									//for(int i : lhm) { }
									for(int i : lhm.keySet()) { }
									for(String s : lhm.values()) { }
									for(Map.Entry<Integer, String> entry : lhm.entrySet()) { }
									

				//Rule #3: The separator must be :, it must not be ; or , or =
									//for(String s, al2) { } 
									//for(String s; al2) { }
									//for(String s = al2) { }
									
				//Rule #4:
									String s;
									//for(s : al2) { }
	}
}
