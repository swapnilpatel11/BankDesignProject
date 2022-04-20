package com.fdmgroup.bankDesignProject;

public abstract class Account {
	private final long ACCOUNT_ID=nextAccountId;
	private static long nextAccountId=1000;
	protected double balance;
	
	public Account() {
		super();
		this.nextAccountId += 5; //increase number by 5 when generate new id
	}

	public double withdraw(double amount) {
		balance -= amount;   //withdraw amount from balance
		return amount;
		
	}
	
	public void deposit(double amount) {
		balance += amount;  //add amount to balance 
	}
	public void correctBalance(double amount) {
		balance = amount;  //condition to compare correct balance
	}

	public long getACCOUNT_ID() {
		return  ACCOUNT_ID;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	

}
