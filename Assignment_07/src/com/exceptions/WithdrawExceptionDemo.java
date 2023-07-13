package com.exceptions;

import java.util.Scanner;

class WithdrawException extends Exception
{
	WithdrawException(String msg) {
		super(msg);
	}
	WithdrawException() {
		// TODO Auto-generated constructor stub
	}
}

class Amount
{
	double amount,balance;
	Amount(double amount,double balance)
	{
		this.amount=amount;
		this.balance=balance;
	}
	void withdraw(double amount,double balance) throws WithdrawException
	{
		if (amount>balance)
		{
			throw new WithdrawException("Insufficient Balance");
		}
		else
		{
			System.out.println("Balance before withdraw : " + this.balance);
			this.balance-=amount;
			System.out.println("Balance after Withdraw : "+this.balance);
		}
	}
}

public class WithdrawExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the withdraw amount and balance");
		double amount,balance;
		amount=scanner.nextDouble();
		balance=scanner.nextDouble();
		Amount amount_obj=new Amount(amount, balance);
		try {
			amount_obj.withdraw(amount, balance);
		} catch (WithdrawException e) {
			System.err.println(e);
		}
	}

}
