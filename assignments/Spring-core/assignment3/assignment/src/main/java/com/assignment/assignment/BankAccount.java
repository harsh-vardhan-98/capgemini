package com.assignment.assignment;

public class BankAccount {
		private long accountid;
		private String holderName;
		private String typeOfAccount;
		private double balance ;
		
		
		public long getAccountid() {
			return accountid;
		}
		public void setAccountid(long accountid) {
			this.accountid = accountid;
		}
		public String getHolderName() {
			return holderName;
		}
		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}
		public String getTypeOfAccount() {
			return typeOfAccount;
		}
		public void setTypeOfAccount(String typeOfAccount) {
			this.typeOfAccount = typeOfAccount;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
}
