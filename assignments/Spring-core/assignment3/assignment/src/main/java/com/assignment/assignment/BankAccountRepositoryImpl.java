package com.assignment.assignment;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	BankAccount bankaccount;
	

	public BankAccountRepositoryImpl(BankAccount bankaccount) {
		super();
		this.bankaccount = bankaccount;
	}

	@Override
	public double getBalance(long accountId) {
		if(accountId == bankaccount.getAccountid()) {
			return bankaccount.getBalance();
		}else {
			return 0;
		}
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		if(accountId == bankaccount.getAccountid()) {
			bankaccount.setBalance(bankaccount.getBalance()+newBalance);
			return bankaccount.getBalance();
		}else {
			return 0;
		}
	}

}
