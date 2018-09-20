package com.collections.Set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {


		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(12);
		hs.add(13);
		hs.add(16);
		hs.add(131);
		hs.add(139);
		
		// ForEach && lambda expression
		System.out.println("ForEach && lambda expression");
		hs.forEach(i -> {
			System.out.println(i);
		});
		
		
		// Iterator	
		Iterator<Integer> ihs = hs.iterator();
		System.out.println("Iterator");
		while(ihs.hasNext())
			System.out.println(ihs.next());
		
		// Iterator & forEachRemaining
		Iterator<Integer> ihs1 = hs.iterator();
		System.out.println("Iterator & ForEach");
		ihs1.forEachRemaining(i -> {
			System.out.println(i);
		});
		
		// Iterator using simple for each loop
        System.out.println("simple for-each loop ");
        for(int i:hs) 
        	System.out.println(i);
		
		
		
	}

}
