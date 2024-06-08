package com.simplilearn;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		if ( amount < 0 ) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if  ( amount > balance ) {
			throw new InsufficientFundsException("Insufficient funds for this withdrawal");
		}
		
		this.balance -= amount;
		
	}
	
	public double getBalance() {
		return balance;
	}
}

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}


//END Bank Account Class
