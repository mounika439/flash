package com.oops.inheritance;

public class Main {
	
	public static void main(String[] args){
		
		Car myCar = new Car(4,2014,"Red","Toyota",4,60000);
		System.out.println(myCar.getColor());	
		System.out.println(myCar.getMileage());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getYear());
		System.out.println(myCar.getSeats());
		
		System.out.println(myCar.toString());
		
		myCar.setColor("Black");
		System.out.println(myCar.toString());

		
		
		
	}

}
