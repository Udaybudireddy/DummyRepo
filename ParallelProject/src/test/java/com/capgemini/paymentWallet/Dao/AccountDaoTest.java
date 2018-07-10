package com.capgemini.paymentWallet.Dao;

import com.capgemini.paymentWallet.Service.AccountService;
import com.capgemini.paymentWallet.bean.AccountDetails;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AccountDaoTest extends TestCase {
	
	AccountDetails account = new AccountDetails();
	AccountService service = new AccountService();

	public void testAddAccountDetails() {
		Assert.assertEquals(0, service.addAccountDetails(account));//fail case
		Assert.assertNull(account);//fail case
		Assert.assertTrue(true);//pass case
	
	}

	public void testSignin() {
		
		Assert.assertEquals(false, service.signin("abcxyz@jkl.com", "asdasdasd"));//pass case
		}

	public void testDisplayBalance() {
		
		Assert.assertEquals(false, service.displayBalance(12345));//fail case
		
	}

	public void testAddBalance() {
		Assert.assertNull(account);//fail case
		Assert.assertTrue(service.addBalance(1000));//fail case
		Assert.assertTrue(true);//pass case
	}

	public void testRemoveBalance() {
		
		Assert.assertEquals(0, service.removeBalance(10000));//fail case
		Assert.assertTrue(true);//pass case
		Assert.assertNull(account);//fail case
		
	}

	public void testFundTransfer() {
		
		Assert.assertEquals(0, service.fundTransfer(1000));//fail case
		Assert.assertNotNull(account);//pass case
		
	}

	public void testPrintTransaction() {
	
		Assert.assertEquals(0, service.printTransaction(12345));//fail case
		Assert.assertNull(account);//fail case
		
	}

}
