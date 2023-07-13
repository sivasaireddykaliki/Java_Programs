// Program 10

package com.account;



public class Account {
	int acctId;
	String acctType;
	int acctBalance;
	public Account(int acctId,String acctType,int acctBalance)
	{
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
	}
	public void withdraw(int amount)
	{
		if(amount<=acctBalance)
			acctBalance=acctBalance-amount;
		else
			System.out.println("Withdraw Limit Exceeded. Insufficient Balance");
		System.out.println();
	}
	
	public void deposit(int amount)
	{
		acctBalance+=amount;
	}
	
	public int getBalance()
	{
		return acctBalance;
	}
	
	public void display()
	{
		System.out.println("Account Balance Details ");
		System.out.println("Account Id :	Account Type:	Account Balance:");
		System.out.println(acctId+"		"+acctType+"		"+getBalance());
		System.out.println("--------------------------------");
	}
}
