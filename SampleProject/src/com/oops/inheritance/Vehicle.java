package com.oops.inheritance;

public class Vehicle {
	
	
	private int wheels;
	private int year;
	private String color;
	
	public void moving(){
		System.out.println("Vehicle is moving");
	}
	
	
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", year=" + year + ", color=" + color + "]";
	}

	public Vehicle(int wheels, int year, String color) {
		this.wheels = wheels;
		this.year = year;
		this.color = color;
	}
	
	
	

}
