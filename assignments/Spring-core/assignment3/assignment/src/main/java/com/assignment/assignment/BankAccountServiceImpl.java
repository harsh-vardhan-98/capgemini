package com.assignment.assignment;

public class BankAccountServiceImpl implements BankAccountService {
	BankAccountRepositoryImpl bankAccountRepositoryImpl;
	
	
	
	public BankAccountServiceImpl(BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		super();
		 this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		if(accountId == bankAccountRepositoryImpl.bankaccount.getAccountid()) {
			double accountbalance = bankAccountRepositoryImpl.bankaccount.getBalance();
			double withdrawn = bankAccountRepositoryImpl.bankaccount.getBalance() - balance;
			bankAccountRepositoryImpl.bankaccount.setBalance(bankAccountRepositoryImpl.bankaccount.getBalance() - balance);
			return  accountbalance - withdrawn;
		}else {
			return 0;
		}
		
	}

	@Override
	public double deposit(long accountId, double balance) {
		
		if(accountId == bankAccountRepositoryImpl.bankaccount.getAccountid()) {
			double accountbalance = bankAccountRepositoryImpl.bankaccount.getBalance();
			double deposit = bankAccountRepositoryImpl.bankaccount.getBalance() + balance;
			bankAccountRepositoryImpl.bankaccount.setBalance(bankAccountRepositoryImpl.bankaccount.getBalance() + balance);
			return  accountbalance + deposit;
		}else {
			return 0;
		}
	}

	@Override
	public double getBalance(long accountId) {
		
		if(accountId == bankAccountRepositoryImpl.bankaccount.getAccountid()) {	
			return bankAccountRepositoryImpl.bankaccount.getBalance();
		}else {
			return 0;
		}
	}



}
