package com.nit.hk.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Test05_Set_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Object> ts1 = new TreeSet<Object>();
		System.out.println("size\t:"+ts1.size());
		System.out.println();
		
		ts1.add("a");	System.out.println(ts1);
		ts1.add("c");	System.out.println(ts1);
		ts1.add("b");	System.out.println(ts1);
		
		System.out.println();
		System.out.println(ts1);
		System.out.println("size\t:"+ts1.size());
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		
		System.out.println();
		System.out.println(ts2);
		System.out.println("size\t:"+ts2.size());
		
		TreeSet<Sa> ts3 = new TreeSet<>();
		ts3.add(new Sa(5,6));
		ts3.add(new Sa(6,3));
		ts3.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts3);
		System.out.println("size\t:"+ts3.size());
		
		TreeSet<Sa> ts4 = new TreeSet<>(new SaXDescComparator() );
		ts4.add(new Sa(5,6));
		ts4.add(new Sa(6,3));
		ts4.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts4);
		System.out.println("size\t:"+ts4.size());
		
		TreeSet<Sa> ts5 = new TreeSet<>(
					new Comparator<Sa>() {
								@Override
								public int compare(Sa s1, Sa s2) {
									return s1.getX() - s2.getX();
								}
		});
		
		ts5.add(new Sa(5,6));
		ts5.add(new Sa(6,3));
		ts5.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts5);
		System.out.println("size\t:"+ts5.size());
		
		TreeSet<Sa> ts6 = 
				 new TreeSet<Sa>(
							(Sa s1, Sa s2) -> {
								return s2.getY() - s1.getY();
							}
				);
		
		ts6.add(new Sa(5,6));
		ts6.add(new Sa(6,3));
		ts6.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts6);
		System.out.println("size\t:"+ts6.size());
		
		TreeSet<Sa> ts7 = 
				new TreeSet<Sa>(
						(s1, s2) -> {
							return s2.getY() - s1.getY();
						}
			   );
		
		ts7.add(new Sa(5,6));
		ts7.add(new Sa(6,3));
		ts7.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts7);
		System.out.println("size\t:"+ts7.size());
		
		TreeSet<Sa> ts8 = 
				new TreeSet<Sa>((s1, s2) ->  s2.getY() - s1.getY()	);
		
		ts8.add(new Sa(5,6));
		ts8.add(new Sa(6,3));
		ts8.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts8);
		System.out.println("size\t:"+ts8.size());
		
		TreeSet<Sa> ts9 = 
				new TreeSet<Sa>((io1, io2) ->  io2.compareTo(io1)	);
		
		ts9.add(new Sa(5,6));
		ts9.add(new Sa(6,3));
		ts9.add(new Sa(7,8));
		
		System.out.println();
		System.out.println(ts9);
		System.out.println("size\t:"+ts9.size());
		System.out.println();
		
		//TreeSet<Ex> ts10 = new TreeSet<>();
		TreeSet<Ex> ts10  = new TreeSet<>((e1, e2) -> e1.getX()-e2.getX());
		ts10.add(new Ex(5,6));
		ts10.add(new Ex(7,3));
		ts10.add(new Ex(8,7));
		System.out.println(ts10);
		System.out.println();
		
		TreeSet<Ex> ts11  = new TreeSet<>((e1, e2) -> e2.getX()-e1.getX());
		ts11.add(new Ex(5,6));
		ts11.add(new Ex(7,3));
		ts11.add(new Ex(8,7));
		System.out.println(ts11);
		System.out.println();
		
		TreeSet<Ex> ts12  = new TreeSet<>((e1, e2) -> e2.getY()-e1.getY());
		ts12.add(new Ex(5,6));
		ts12.add(new Ex(7,3));
		ts12.add(new Ex(8,9));
		System.out.println(ts12);
		System.out.println();
		
		TreeSet<Ex> ts13  = new TreeSet<>((e1, e2) -> e1.getY()-e2.getY());
		ts13.add(new Ex(5,6));
		ts13.add(new Ex(7,3));
		ts13.add(new Ex(8,9));
		System.out.println(ts13);
		System.out.println();
		
		TreeSet<Integer> ts14 = new TreeSet<Integer>();
		ts14.add(5);
		ts14.add(4);
		ts14.add(6);
		ts14.add(3);
		System.out.println(ts14);
		System.out.println();
		
		TreeSet<Ex> ts15 = new TreeSet<>(
				(e1, e2) -> //{return 0;}
									//{return -1;}
									//{return 1;}
									//{return e1.getX() - e2.getX();}
									{return e2.getX() - e1.getX();}
									);
		ts15.add(new Ex(5, 6));
		ts15.add(new Ex(7, 4));
		ts15.add(new Ex(6, 8));
		ts15.add(new Ex(6, 8));
		ts15.add(new Ex(7, 4));
		System.out.println(ts15);
		System.out.println();
	}

}
class SaXDescComparator implements Comparator<Sa>{
	@Override
	public int compare(Sa s1, Sa s2) {
		return s2.getX() - s1.getX();
	}
}