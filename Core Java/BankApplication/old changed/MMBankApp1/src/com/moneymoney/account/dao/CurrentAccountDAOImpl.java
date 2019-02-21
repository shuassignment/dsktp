package com.moneymoney.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.util.DBUtil;

public class CurrentAccountDAOImpl implements CurrentAccountDAO{

	@Override
	public CurrentAccount createNewAccount(CurrentAccount account) throws ClassNotFoundException, SQLException {
		Connection connection = DBUtil.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ACCOUNT (account_hn,account_bal,odLimit,type) VALUES(?,?,?,?)");
		preparedStatement.setString(1, account.getBankAccount().getAccountHolderName());
		preparedStatement.setDouble(2, account.getBankAccount().getAccountBalance());		
		preparedStatement.setDouble(3, account.getOdLimit());
		preparedStatement.setString(4, "CA");
		preparedStatement.executeUpdate();
		preparedStatement.close();
		DBUtil.closeConnection();
		return account;
	}

	@Override
	public CurrentAccount updateAccount(CurrentAccount account) {
		// TODO Auto-generated method stub
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
	public List<CurrentAccount> getAllCurrentAccount() throws ClassNotFoundException, SQLException {

		Connection connection=DBUtil.getConnection();

		return null;
	}

	@Override
	public void updateBalance(int accountNumber, double currentBalance)
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}

}
