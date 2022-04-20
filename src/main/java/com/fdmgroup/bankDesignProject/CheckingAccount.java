package com.fdmgroup.bankDesignProject;

public class CheckingAccount extends Account {
	//defined only values when variable is static
	//initialization of checkNumber
	private int nextCheckNumber=1;

	//increment by 1 for checkNumber
	public int getNextCheckNumber() {
		return nextCheckNumber++;
	}
	
	
}
