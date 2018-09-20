package com.collections.List;

import java.util.*;

public class VectorExample {
	
	public static void main(String[] args){
		
		List<Integer> vl = new Vector<>();
		vl.add(1);
		vl.add(13);
		vl.add(14);
		vl.add(15);
		vl.add(16);

		System.out.println(vl);
		vl.remove(1);
		//-- applicable in collections only remove(Object o) 
		// vl.remove(15); 
		System.out.println(vl);


		
		Vector<Integer> vl2 = new Vector<>(5,10);
		vl2.addElement(new Integer(13));
		vl2.addElement(new Integer(14));
		vl2.addElement(new Integer(15));
		vl2.addElement(new Integer(16));
		vl2.addElement(new Integer(17));
		System.out.println("before size: " +vl2.size());
		System.out.println("before capacity: " +vl2.capacity());

		
		vl2.addElement(new Integer(18));
		System.out.println("after size:"+vl2.size());
		System.out.println("before capacity: " +vl2.capacity());

		System.out.println(vl2);
		
		// enumerate the elements in the vector.
	     Enumeration<Integer> vEnum = vl2.elements();
	     while(vEnum.hasMoreElements()){
	    	 System.out.println(vEnum.nextElement());
	     }
		
	     // ListIterator can use in Vector
	     ListIterator<Integer> li = vl2.listIterator();
	     while(li.hasNext()){
	    	 System.out.println("next: " +li.next());
	     }
	     // Print Previous Object
    	 System.out.println("previous: "+li.previous());

	}

}
