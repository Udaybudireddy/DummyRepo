package com.capgemini.paymentWallet.Service;

import com.capgemini.paymentWallet.bean.AccountDetails;

public interface IAccountService {
	
	boolean addAccountDetails(AccountDetails account);
	
	boolean signin(String email, String password);
	 
	double displayBalance(long accountNumber);
	 
	boolean addBalance(long accountNumber);
	
	boolean removeBalance(long accountNumber);
	
	boolean fundTransfer(long accountNumber);
	
	boolean printTransaction(long transId);

}
