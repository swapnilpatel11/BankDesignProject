package com.fdmgroup.bankDesignProject;

public class Person extends Customer{

	public Person(String name, String address) {
		super(name, address);
	}
	
	@Override
	public void chargeAllAccounts(double amount) {
		//catch every account of person to deduct amount 
		for(Account account : getAccounts()) {
			 account.balance -= amount;
		 }
	}
}
