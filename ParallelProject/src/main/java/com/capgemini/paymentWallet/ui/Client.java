package com.capgemini.paymentWallet.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.paymentWallet.Exception.AccountNotCreated;
import com.capgemini.paymentWallet.Service.AccountDataValidate;
import com.capgemini.paymentWallet.Service.AccountService;
import com.capgemini.paymentWallet.bean.AccountDetails;

public class Client {
	
	static boolean b;

	public static void main(String[] args) {
		

		System.out.println("*****Welcome to XYZ Bank*****");
		System.out.println("1. Create a New Account");
		System.out.println("2. Sign in");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i;
		
		try {
			
			do
			{	
				System.out.println("Enter your choice : ");
				 i = Integer.parseInt(br.readLine());
			
				switch(i)
				{
				case 1:
				{
					account();
					break;
				}
				case 2:
				{
					signin();
					break;
				}
				case 3:
				{
					System.exit(0);
					break;
				}
				default:
				{
					System.out.println("Invalid Option");
					break;
				}
				}
			}while(i!=4);
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void signin() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your EmailID : ");
		AccountDataValidate validate = new AccountDataValidate();
		AccountDetails account = new AccountDetails();
		try {
			String email = br.readLine();
			System.out.println("Enter Password : ");
			String password = br.readLine();
			
			account.setEmail(email);
			account.setPassword(password);
			
			
			/*System.out.println("3. Show Account Balance");
			System.out.println("4. Deposit the money");
			System.out.println("5. Withdraw the money");
			System.out.println("6. Transfer Funds");
			System.out.println("7. Print transactions");
			System.out.println("8. Exit");*/
			
		/*case 2:
		{
			account();
			break;
		}
		case 3:
		{
			balance();
			break;
		}
		case 4:
		{
			deposit();
			break;
		}
		case 5:
		{
			withdraw();
			break;
		}
		case 6:
		{
			fundTransfer();
			break;
		}
		case 7:
		{
			print();
			break;
		}
*/		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void account() 
	{
		int j=0;
		long transId = 0;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your Name : ");
			String name = br.readLine();
			
			System.out.println("Enter Gender : ");
			String gender = br.readLine();
			
			System.out.println("Enter age : ");
			Integer age = Integer.parseInt(br.readLine());
			
			System.out.println("Enter EmailID : ");
			String email = br.readLine();
			
			System.out.println("Enter your Address : ");
			String address = br.readLine();
			AccountDetails account = new AccountDetails();
			AccountDataValidate validate = new AccountDataValidate();
			AccountService service = new AccountService();
			System.out.println("Enter Your Phone Number : ");
			do
			{
				String phoneNumber = br.readLine();
				boolean isValidPhoneNumber = validate.validatePhoneNumber(phoneNumber);
				
				if(isValidPhoneNumber)
				{
					
					account.setPhoneNumber(phoneNumber);
					j=1;	
				}
				
			}while(j!=1);
			
			System.out.println("Enter Your Aadhar Number : ");
			do
			{
				String aadhar = br.readLine();
				boolean isValidAadhar = validate.validateAadhar(aadhar);
				if(isValidAadhar)
				{
					account.setAadhar(aadhar);
					j=2;	
				}
			}while(j!=2);
			
			
			
			System.out.println("Enter the amount for account initiation(Minimum balance should be 500): ");
			do
			{
				double balance = Double.parseDouble(br.readLine());
				boolean isValidBalance = validate.validatebalance(balance);
				if(isValidBalance)
				{
					account.setBalance(balance);
					j=3;	
				}
				else
				{
					System.out.println("Enter valid Balance : ");
				}
				
			}while(j!=3);
			
			long accountNumber = (long)(Math.random()*100000 + 9999);
			System.out.println(transId);
			
			
			
			account.setName(name);
			account.setGender(gender);
			account.setAge(age);
			account.setAddress(address);
			account.setTransId(transId);
			account.setAccountNumber(accountNumber);
			account.setEmail(email);
			System.out.println("Set up login password for your account : ");
			do
			{
				String password = br.readLine();
				System.out.println(password.length());
				boolean isValidPassword = validate.validatepassword(password);
				if(isValidPassword)
				{
					account.setPassword(password);
					System.out.println("Password set successfully....");
					System.out.println(account.getPassword());
					j=4;	
				}
				else
				{
					System.out.println("Enter valid Password : ");
				}
				
			}while(j!=4);
				
						
			if(service.addAccountDetails(account))
			{
				
				System.out.println("Account Successfully created....");
				System.out.println("Your Account Number is : "+account.getAccountNumber());
				
			}
			else
			{
				try
				{
					throw new AccountNotCreated(); 
				}
				catch(AccountNotCreated e)
				{
					System.err.println("Account is not created.......");
				}
			}
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void balance() {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AccountService service = new AccountService();
		
		try {
			System.out.println("Enter Your AccountNumber : ");
			long accountNumber = Long.parseLong(br.readLine());
			System.out.println("Enter Your Password : ");
			String password = br.readLine();
			
			System.out.println(service.displayBalance(accountNumber));
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		

		
	}

}
