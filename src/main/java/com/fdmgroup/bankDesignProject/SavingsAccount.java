package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account{
	
	

	private double interestRate;
	
	//overdrawn protection balance condition 
	public double withdraw(double amount) {
		if(balance >= amount) {
		balance -= amount;
		return amount;
		}
		return 0;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//Balance with interest 
	public void addInterest() {
		balance += getBalance() * (this.interestRate/100);
	}
}
