package oopsAssignment;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3{
	int totalDeposits = 10000;
	int creditLimit = 2000;
	
	
	public  int getCash() {
		return totalDeposits;
		
	}
	
}


class SavingAccount extends Assignment2Q3{
	int totalDeposits = 10000;
	int fixedDeposits = 5000;
	
	public int getCash() {
		return totalDeposits;
	}
	
	
}



public class Assignment2Q3 {
	
	int cash = 0;
	public static int totalCashInBank(ArrayList<Integer> cash) {
		int sum= 0;
		for(int money:cash) {
			sum+=money;
		}
		return sum;
	}
	public int getCash() {
		return cash;
	}
	public static void main(String[] args) {
		ArrayList<Integer> customer = new ArrayList<>();
		SavingAccount s1 = new SavingAccount();
		SavingAccount s2 = new SavingAccount();
		SavingAccount s3 = new SavingAccount();
		
		customer.add(s1.getCash());
		customer.add(s2.getCash());
		customer.add(s3.getCash());
		
		
		System.out.println(totalCashInBank(customer));
		System.out.println("--------------------------------");
		
		CurrentAccount c1 = new CurrentAccount();
		CurrentAccount c2 = new CurrentAccount();
		CurrentAccount c3 = new CurrentAccount();

		customer.add(c1.getCash());
		customer.add(c2.getCash());
		customer.add(c3.getCash());

		System.out.println(totalCashInBank(customer));
		
	}

}
