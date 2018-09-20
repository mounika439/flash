package com.oops.interfaceExmple;

public interface BankAccount {
	
	public int balance(); 
	final int aval_balance = 5000;
	
}

class mounika{
	
	public static void main(String[] args) {

		
		BankAccount a = new SavingsAccount();
		System.out.println(a.balance());
		
		BankAccount b = new CheckingAccount();
		System.out.println(b.balance());

	}

	
}