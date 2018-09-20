package com.Interface.Cloneable;

public class Dog implements Cloneable {
	
	private String dname;
	
	public Dog(String dname){
		this.dname = dname;
	}
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// Overriding clone() method of Object class
   public Object clone()throws CloneNotSupportedException{  
	   return (Dog)super.clone();  
   }

   
	public static void main(String[] args) {
		
		Dog obj1 = new Dog("Shadow");
		try{
			Dog obj2 = (Dog)obj1.clone();
			System.out.println(obj2.getDname());

		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
