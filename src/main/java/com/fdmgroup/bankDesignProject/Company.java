package com.fdmgroup.bankDesignProject;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
		
	}
	
	
	@Override
	public void chargeAllAccounts(double amount) {
		//used if condition to compare account
		for(Account account : getAccounts()) {
			if(account instanceof CheckingAccount) {
				account.balance -= amount;
			}else if(account instanceof SavingsAccount) {
				account.balance -= (amount*2);
			}
		}
		
	}

	

}
