package com.collections.Set;

import java.util.*;



class MyComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2) ;
	}
	
}

public class ComparableExample {
	
	public static void main(String[] args){
	
	TreeSet<Integer> ts = new TreeSet<>(new MyComparator());
	ts.add(12);
	ts.add(102);
	ts.add(120);
	ts.add(1);
	ts.add(1200);
	ts.add(77);
	ts.add(44);

	System.out.println(ts);
	
	//    SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
	//    SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	}
	
}
