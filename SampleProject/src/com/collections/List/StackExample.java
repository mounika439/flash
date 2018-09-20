package com.collections.List;

import java.util.*;

public class StackExample {
	
	public static void main(String[] args){
		
		// Last in First Out
		Stack<String> sl = new Stack<>();
		
		sl.push("Rose");
		sl.push("Lilly");
		sl.push("Jasmines");
		sl.push("Tulips");

		// returns top item w/o removal
		System.out.println("peek: "+sl.peek());
		System.out.println(sl);
		
		
		// returns top item with removal
//		System.out.println("Pop: " +sl.pop());
//		System.out.println(sl);

		int i = sl.search("Lilly");
		System.out.println("lilly found at : "+ i);
		
		
		
		
	}
	

}
