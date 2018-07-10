package com.capgemini.paymentWallet.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.capgemini.paymentWallet.bean.AccountDetails;




public class AccountDao implements IAccountDao{

	
	static List<AccountDetails> list = new ArrayList<AccountDetails>();
public boolean addAccountDetails(AccountDetails account) {
	boolean b = list.add(account);
	System.out.println(list);
	if(b)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
public boolean signin(String email, String password) {
	
	Iterator<AccountDetails> it = list.iterator();
	
	while (it.hasNext()) {
		AccountDetails account = (AccountDetails)it.next();
		if(account.getEmail()==email && account.getPassword()==password)
		{ 
			
			return true;
		}
		else
		{
			return false;
		}
		

	}
	return false;
	
}
	
	public double displayBalance(long accountNumber) {
		
		Iterator<AccountDetails> it = list.iterator();
		
		while (it.hasNext()) {
			AccountDetails account = (AccountDetails)it.next();
			if(account.getAccountNumber()==accountNumber)
			{ 
				System.out.println("Your Account Balance is : ");
				return account.getBalance();
			}
			else
			{
				return 0;
			}
			

		}
		return 0;
		
			}
	
	public boolean addBalance(long accountNumber) {
		return false;
	}
	
	public boolean removeBalance(long accountNumber) {
		return false;
	}
	
	public boolean fundTransfer(long accountNumber) {
		return false;
	}
	
	public boolean printTransaction(long transId) {
		return false;
	}

	

}
