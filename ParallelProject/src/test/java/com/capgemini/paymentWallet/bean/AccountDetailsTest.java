package com.capgemini.paymentWallet.bean;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AccountDetailsTest extends TestCase {

	AccountDetails account = new AccountDetails();
	
	public void testGetName() {
		account.setName("Uday Kumar Budireddy");
		
		Assert.assertEquals("uday",account.getName());//fail case
		Assert.assertEquals("Uday Kumar Budireddy",account.getName());//pass case
		Assert.assertNotSame("Kumar", account.getName());//pass case
	}
	
	public void testGetPassword() {
		account.setPassword("asdasdasd");
		
		Assert.assertEquals("asdasd",account.getPassword());//fail case
		Assert.assertEquals("asdasdasd",account.getPassword());//pass case
		Assert.assertNotSame("asdas",account.getPassword());//pass case	
	}


	public void testGetAadhar() {
		
		account.setAadhar("123123123123");
		
		Assert.assertEquals("123123",account.getAadhar());//fail case
		Assert.assertEquals("123123123123",account.getAadhar());//pass case
		Assert.assertNotSame("12312312",account.getAadhar());//pass case
	}

	public void testGetAccountNumber() {
		
		account.setAccountNumber(12345);
		
		Assert.assertEquals(12345,account.getAccountNumber());//pass case
		Assert.assertEquals("k",account.getAccountNumber());//fail case
		Assert.assertNotSame(1234,account.getAccountNumber());//pass case
	}

	public void testGetBalance() {
		
		account.setBalance(1999);;
		
		Assert.assertEquals(1999,account.getBalance());//pass case
		Assert.assertEquals("k",account.getBalance());//fail case
		Assert.assertNotSame(1234,account.getBalance());//pass case
	}

	public void testGetGender() {
		account.setGender("male");
		
		Assert.assertEquals("male",account.getGender());//pass case
		Assert.assertEquals("k",account.getGender());//fail case
		Assert.assertNotSame("female",account.getGender());//pass case
		
	}

	public void testGetAge() {
		account.setAge(24);
		
		Assert.assertEquals(24,account.getAge());//pass case
		Assert.assertEquals(12,account.getAge());//fail case
		Assert.assertNotSame(12,account.getAge());//pass case
	}

	public void testGetEmail() {
		account.setEmail("abcxyz@jkl.com");
		
		Assert.assertEquals("abcxyz@jkl.com",account.getEmail());//pass case
		Assert.assertEquals("abcxyz@jkl",account.getEmail());//fail case
		Assert.assertNotSame("abc@jkl.com",account.getEmail());//pass case
	}

	public void testGetPhoneNumber() {
		
		account.setPhoneNumber("1231231231");
		
		Assert.assertEquals("1231231231",account.getPhoneNumber());//pass case
		Assert.assertEquals("123123123",account.getPhoneNumber());//fail case
		Assert.assertNotSame("123123123",account.getPhoneNumber());//pass case
	}

	public void testGetAmount() {
		
		account.setAmount(1999);
		
		Assert.assertEquals(1999,account.getAmount());//pass case
		Assert.assertEquals(1234,account.getAmount());//fail case
		Assert.assertNotSame(1234,account.getEmail());//pass case
		
	}
	public void testGetTransId() {
		
		account.setTransId(19994);
		
		Assert.assertEquals(19994,account.getTransId());//pass case
		Assert.assertEquals(1234,account.getTransId());//fail case
		Assert.assertNotSame(1234,account.getEmail());//pass case
		
	}

}
