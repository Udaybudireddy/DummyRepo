package com.capgemini.paymentWallet.Service;

import com.capgemini.paymentWallet.Dao.AccountDao;
import com.capgemini.paymentWallet.bean.AccountDetails;

public class AccountService implements IAccountService{
	
	AccountDao dao = new AccountDao();

	public boolean addAccountDetails(AccountDetails account) {
		
		return dao.addAccountDetails(account);
	}
	
	public boolean signin(String email, String password) {
		
		return dao.signin(email, password);	
	}

	public double displayBalance(long accountNumber) {
		
		return dao.displayBalance(accountNumber);
	}

	public boolean addBalance(long accountNumber) {
		
		return dao.addBalance(accountNumber);
	}

	public boolean removeBalance(long accountNumber) {
		
		return dao.removeBalance(accountNumber);
	}

	public boolean fundTransfer(long accountNumber) {
		
		return dao.fundTransfer(accountNumber);
	}

	public boolean printTransaction(long transId) {
		
		return dao.printTransaction(transId);
	}

	
	
	


}
