package com.company;

@SuppressWarnings("serial")
class InsufficentFundsException extends Exception{
	public InsufficentFundsException(String str) {
		super(str);
	}
}


class BankBalance{
	int bankbalance;
	
	public BankBalance(int money) {
		this.bankbalance = money;
	}
	
	public void withdraw(int amount) throws InsufficentFundsException {
			if (amount>bankbalance) {
				throw new InsufficentFundsException("money is not sufficent");
			}else {
				System.out.println("money is withdrawn");
			}
	
	} 
	
}

public class Assignment3 {
	public static void main(String[] args) {
		
//		BankBalance b = new BankBalance(20000);
//		b.withdraw(22000);
		
	
	}
}
