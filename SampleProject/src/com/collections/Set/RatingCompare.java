package com.collections.Set;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{
	

	public int compare(Movie o1, Movie o2) {

		if(o1.getRating() > o2.getRating()) 
			return 1;
		
		else if(o1.getRating() < o2.getRating()) 
			return -1;
		
		else return 0;
		
	}


}


class NameCompare implements Comparator<Movie> {
	
   
	public int compare(Movie m1, Movie m2) {
    	
        return m1.getName().compareTo(m2.getName()); 
    } 
} 
