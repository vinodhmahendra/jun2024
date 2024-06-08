package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
	
	@Test
	void withdrawMoreThanBalanceShouldThrowException() {
		BankAccount account = new BankAccount(100.00);
		double withdrawAmount = 150;
		assertThrows(InsufficientFundsException.class, () -> account.withdraw(withdrawAmount),
				"should throw InsufficienFundsException when withdrawl amount exceeds balance.");
	}
	
	@Test
	void depositNegativeAmountShouldThrowException() {
		BankAccount account = new BankAccount(100.00);
		double depositAmount = -50.00;
		assertThrows(IllegalArgumentException.class, () -> account.deposit(depositAmount),
				"should throw IllegalArgumentException when trying to deposit a negative amount.");
	}

}

/// EnD  BankAccountTest
