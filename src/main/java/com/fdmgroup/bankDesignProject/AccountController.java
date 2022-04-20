package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
	
	private List<Customer> customers;
	private List<Account> accounts;
	
	
	public AccountController() {
		super();
		customers = new ArrayList<Customer>();
		accounts = new ArrayList<Account>();
	}

	public Customer createCustomer(String name,String address,String type) {
		if(type.equals("person")) {
			Person person = new Person(name,address); //object created
			customers.add(person); //add object to customers list
			return person;
		}else if(type.equals("company")) {
			Company company = new Company(name,address); 
			customers.add(company);
			return company;
		}
		return null;
	}
	
	public Account createAccount(Customer customer,String type) {
		if(type.equals("checking")) {
			CheckingAccount checkingAccount = new CheckingAccount(); //create checking object
			accounts.add(checkingAccount); //add object to accounts list
			customer.getAccounts().add(checkingAccount); //add this object to customer's accounts list
			return checkingAccount;
		}else if (type.equals("savings")) {
			SavingsAccount savingsAccount = new SavingsAccount();
			accounts.add(savingsAccount);
			customer.getAccounts().add(savingsAccount);
			return savingsAccount;
		}
		return null;
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer); //remove customer from customers list
		accounts.removeAll(customer.getAccounts()); //remove customer from accounts list
	}
	
	public void removeAccount(Account account) {
		//used foreach for remove account from customer's account list
		for (Customer customer : customers) 
		{
		customer.removeAccount(account);
		}
		accounts.remove(account); //remove account from accounts list
		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	


}
