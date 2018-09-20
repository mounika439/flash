package com.oops.Abstration;

abstract class Employee {
	
	int id;
	String name;
	Double salary;

	
	Employee(int id,String name,Double salary){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return "id :"+id+ "name :"+name +"salary :" +salary;
	}
	
	abstract void cometo();
}



class Manager extends Employee{

	String type;
	Manager(int id, String name, Double salary,String type) {
		super(id, name, salary);
		this.type = type;
	}
	
	@Override
	void cometo() {
	System.out.println("Manager");
		
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class Cashier extends Employee{

	String type;
	Cashier(int id, String name, Double salary,	String type) {
		super(id, name, salary);
		this.type = type;

	}

	@Override
	void cometo() {
		System.out.println("Cashier");
		
	}
	

}


class Samplepolymorphism{
	
	public static void main(String[] args){

		Employee e = new Manager(101, "mounika", 10000.00, "Manager");
		e.cometo();
		System.out.println(e.toString());
	}
		
}
