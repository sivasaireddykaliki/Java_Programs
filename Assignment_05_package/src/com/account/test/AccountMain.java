// Program 10

package com.account.test;

import java.util.Scanner;

import com.account.Account;

public class AccountMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int acctId;
		String acctType;
		int acctBalance;
		System.out.println("Enter the Account Details");
		System.out.println("Enter the Account Number");
		acctId=scanner.nextInt();
		System.out.println("Enter the Account Type");
		acctType=scanner.next();
		System.out.println("Enter the Account Balance");
		acctBalance=scanner.nextInt();
		Account acc=new Account(acctId, acctType, acctBalance);
		while(true)
		{
		System.out.println("Enter any of the below numbers for follwing operations");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Display Balance");
		System.out.println("4. Exit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the amount to deposit");
			int deposit_amt=scanner.nextInt();
			acc.deposit(deposit_amt);
			break;
		case 2: 
			System.out.println("Enter the amount to witdraw");
			int withdraw_amt=scanner.nextInt();
			acc.withdraw(withdraw_amt);
			break;
		case 3:
			acc.display();
			break;
		case 4: 
				System.out.println("Application Exit");
				System.exit(1);
				scanner.close();
				break;
		}
		
		}
		
	}

}
