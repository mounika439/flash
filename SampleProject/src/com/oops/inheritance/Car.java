package com.oops.inheritance;


public class Car extends Vehicle {
	
	private String model;
	private int seats;
	private int mileage;
	
	
	private void carMoving(){
		System.out.println("Car is moving");
	}
	
	@Override
	public void moving(){
		carMoving();
		super.moving();
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}



	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Car(int wheels,int year, String color,String model,int seats, int mileage) {
		super(4,year,color);
		this.model = model;
		this.seats = seats;
		this.mileage = mileage;
	}	


	@Override
	public String toString() {
		return "Car [model=" + model + ", seats=" + seats + ", mileage=" + mileage + "]";
	}


	

}

