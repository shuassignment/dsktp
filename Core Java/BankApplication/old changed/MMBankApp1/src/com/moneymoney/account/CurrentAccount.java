package com.moneymoney.account;

public class CurrentAccount {

	private double odLimit;
	private BankAccount bankAccount;

	/**
	 * @param odLimit
	 * @param bankAccount
	 */
	public CurrentAccount(String accountHolderName, double accountBalance,
			double odLimit) {
		bankAccount = new BankAccount(accountHolderName, accountBalance);
		this.odLimit = odLimit;
	}

	public CurrentAccount(int accountNumber, String accountHolderName, double accountBalance, double odLimit) {
		bankAccount = new BankAccount(accountNumber, accountHolderName, accountBalance);
		this.odLimit = odLimit;
	}
	
	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", bankAccount="
				+ bankAccount + "]";
	}

}
