package com.moneymoney.account.service;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.CurrentAccount;;

public interface CurrentAccountService {
	CurrentAccount createNewAccount(String accountHolderName, double accountBalance, double odLimit) throws ClassNotFoundException, SQLException;

	CurrentAccount updateAccount(CurrentAccount account);

	CurrentAccount getAccountById(int accountNumber);

	CurrentAccount deleteAccount(int accountNumber);
	
	List<CurrentAccount> getAllCurrentAccount() throws ClassNotFoundException, SQLException;

	void fundTransfer(CurrentAccount sender, CurrentAccount receiver, double amount) throws ClassNotFoundException, SQLException;
	void deposit(CurrentAccount account, double amount) throws ClassNotFoundException, SQLException;
	void withdraw(CurrentAccount account, double amount) throws ClassNotFoundException, SQLException;
	
}
