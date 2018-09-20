package com.oops.interfaceExmple;

public  class CheckingAccount implements BankAccount {

	
	@Override
	public int balance() {
		return aval_balance-500;
	}

}
