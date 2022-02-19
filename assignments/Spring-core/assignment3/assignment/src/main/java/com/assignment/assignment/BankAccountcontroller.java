package com.assignment.assignment;

public class BankAccountcontroller {
	BankAccountServiceImpl bankAccountServiceImpl;

	
	public BankAccountcontroller(BankAccountServiceImpl bankAccountServiceImpl) {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl ;
	}

	public double withdraw(long accountId, double balance) {
		double updatedbalance = bankAccountServiceImpl.withdraw(accountId, balance);
		bankAccountServiceImpl.bankAccountRepositoryImpl.bankaccount.setBalance(updatedbalance);
		return bankAccountServiceImpl.bankAccountRepositoryImpl.bankaccount.getBalance();
	}

	public double deposit(long accountId, double balance) {
		double updatedbalance = bankAccountServiceImpl.getBalance(accountId);
		bankAccountServiceImpl.bankAccountRepositoryImpl.bankaccount.setBalance(updatedbalance + balance);
		return bankAccountServiceImpl.bankAccountRepositoryImpl.bankaccount.getBalance();
	}
	

	public double getBalance(long accountId) {
		
		return bankAccountServiceImpl.getBalance(accountId);
		
	}
}
