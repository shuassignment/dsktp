package com.moneymoney.account.service;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.dao.CurrentAccountDAO;
import com.moneymoney.account.dao.CurrentAccountDAOImpl;
import com.moneymoney.account.factory.AccountFactory;

public class CurrentAccountServiceImpl implements CurrentAccountService{

	CurrentAccountDAO currentAccountDAO;
	AccountFactory accountFactory;
	@Override
	public CurrentAccount createNewAccount(String accountHolderName,
			double accountBalance, double odLimit)
			throws ClassNotFoundException, SQLException {
		accountFactory=AccountFactory.getInstance();
		currentAccountDAO=new CurrentAccountDAOImpl();
		return null;
	}

	@Override
	public CurrentAccount updateAccount(CurrentAccount account) {
		
		return null;
	}

	@Override
	public CurrentAccount getAccountById(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAccount deleteAccount(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void fundTransfer(CurrentAccount sender, CurrentAccount receiver,
			double amount) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(CurrentAccount account, double amount)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(CurrentAccount account, double amount)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CurrentAccount> getAllCurrentAccount()
			throws ClassNotFoundException, SQLException {
		return currentAccountDAO.getAllCurrentAccount();
	}

}
