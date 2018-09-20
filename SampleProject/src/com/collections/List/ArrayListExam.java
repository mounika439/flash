package com.collections.List;
import java.util.*;

public class ArrayListExam {
	
	public static void main (String[] args) 
    { 
        // Creating a list 
        List<Integer> al = new ArrayList<>(5); 
        for(int i=0;i<5;i++)
        	al.add(i);
        
        System.out.println("size: "+al.size());
//        System.out.println(al);
//        
//        for(int j=0;j<al.size();j++){
//        	System.out.println(al.get(j));
//        }
//        
//        System.out.println(al.lastIndexOf(1));
//        al.remove(1);
//        System.out.println(al.lastIndexOf(1));
//        System.out.println(al.indexOf(3));
//        
        
        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext())
        	System.out.println(li.next());
        
        System.out.println("Previous Index is : " + li.previousIndex());  

        while(li.hasPrevious())
        	System.out.println("previous: "+li.previous());
        
        System.out.println("Previous Index is : " + li.previousIndex());  
        System.out.println("Next Index is : " + li.nextIndex());
        
        li.add(123);
      
        System.out.println("After inserting 123, ArrayList contains : ");
       
        for(int i = 0; i < al.size(); i++)
        System.out.println(al.get(i));
        
        System.out.println("Next element is : " + li.next());

        li.set(1);

        System.out.println("After replace, ArrayList contains : ");
        
        for(int i = 0; i < al.size(); i++)
        System.out.println(al.get(i));
        
        System.out.println("size: "+al.size());

        
        List al2 = new ArrayList();
        al2.add(1);
        al2.add("mounika");
        al2.add("100.00");
        
        System.out.print("arraylist 2 ::");
        for(int i = 0; i < al2.size(); i++)
        System.out.println(al2.get(i));
 
        
        
        
    } 
}
