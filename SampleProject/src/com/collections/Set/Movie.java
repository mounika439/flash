package com.collections.Set;

public class Movie implements Comparable<Movie>{

	private double rating;
	private String name;
	private int year;
	
	// Constructor 
	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	// Getter and Setter methods
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public int compareTo(Movie m){
	
		System.out.println("Movie Comparable is called ");
		return (this.year - m.year);
	}

}



