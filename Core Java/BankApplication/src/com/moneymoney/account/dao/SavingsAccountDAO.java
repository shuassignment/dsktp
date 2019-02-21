package com.moneymoney.account.dao;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.SavingsAccount;

public interface SavingsAccountDAO {
	
	SavingsAccount createNewAccount(SavingsAccount account) throws ClassNotFoundException, SQLException;
	SavingsAccount updateAccount(SavingsAccount account);
	SavingsAccount getAccountById(int accountNumber);
	SavingsAccount deleteAccount(int accountNumber);
	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;
	void updateBalance(int accountNumber, double currentBalance) throws ClassNotFoundException, SQLException;
	void commit() throws SQLException;
	
	
}
