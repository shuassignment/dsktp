package com.moneymoney.account.service;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.SavingsAccount;

public interface SavingsAccountService {

	SavingsAccount createNewAccount(String accountHolderName, double accountBalance, boolean salary) throws ClassNotFoundException, SQLException;

	SavingsAccount updateAccount(SavingsAccount account);

	SavingsAccount getAccountById(int accountNumber);

	SavingsAccount deleteAccount(int accountNumber);
	
	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;

	void fundTransfer(SavingsAccount sender, SavingsAccount receiver, double amount) throws ClassNotFoundException, SQLException;
	void deposit(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;
	void withdraw(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;
	
}











