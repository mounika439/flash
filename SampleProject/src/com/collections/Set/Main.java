package com.collections.Set;

import java.util.TreeSet;

public class Main {
	
public static void main(String[] args){
		
	
	// NameCompare - comparator - doescall compareTo method
		TreeSet<Movie> ts = new TreeSet<Movie>(new NameCompare());
	
		
	// RatingCompare - comparator - doescall compareTo method
	//	TreeSet<Movie> ts = new TreeSet<Movie>(new RatingCompare());
		
	//  empty tree intialization - comparable - compareTo method call	
	//	TreeSet<Movie> ts = new TreeSet<Movie>();

//		ts.add(new Movie(3.5,"Avengers2",2010));
//		ts.add(new Movie(4,"Avengers1",2000));
		ts.add(new Movie(1,"DDD",2019));
		ts.add(new Movie(2,"CCC",2001));
		ts.add(new Movie(3,"BBB",2003));


		for(Movie movie:ts){
			System.out.println("Name: "+movie.getName());
			System.out.println("Year: "+movie.getYear());
			System.out.println("Rating: "+movie.getRating());

		}
	}

}
