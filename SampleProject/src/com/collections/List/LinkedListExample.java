package com.collections.List;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args){
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
	
		
		for(int i=0;i<5;i++){
			ll.add(i);	
		}
	
		ll.addFirst(123);
		ll.addLast(999);
		
		System.out.println(ll);
		System.out.println("getFirst: "+ll.getFirst());
		System.out.println("getLast: "+ll.getLast());
		System.out.println("removeFirst: "+ll.removeFirst());
		System.out.println(ll);
		System.out.println("removeLast: "+ll.removeLast());
		System.out.println(ll);

        for(int i = 0; i < ll.size(); i++)
        System.out.println(ll.get(i));

		

	}
}
