// Program 5
package package1;

import java.util.Scanner;

class Customer
{
	int custId;
	String custName;
	String custAddress;
	Customer(int custId,String custName, String custAddress)
	{
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}
	public void display()
	{
		System.out.println("Customer Details");
		System.out.println("Customer Id : "+custId);
		System.out.println("Customer Name : "+custName);
		System.out.println("Customer Address : "+custAddress);
		System.out.println();
	}
}


class Account
{
	int acctId;
	String acctType;
	int acctBalance;
	Customer customer;
	Account(int acctId,String acctType,int acctBalance, Customer customer)
	{
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
		this.customer=customer;
	}
	public void display()
	{
		System.out.println("Account Details");
		System.out.println("Account Id : "+acctId);
		System.out.println("Account Type : "+acctType);
		System.out.println("Account Balance : "+acctBalance);
		System.out.println();
		customer.display();
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Account Details");
		int acctId,acctBalance,custId;
		String acctType,custName,custAddress;
		System.out.println("Enter the Account Id");
		acctId=scanner.nextInt();
		System.out.println("Enter the Account Type");
		acctType=scanner.next();
		System.out.println("Enter the Account Balance");
		acctBalance=scanner.nextInt();
		System.out.println("Enter the Customer Details");
		System.out.println("Enter the Customer Id ");
		custId=scanner.nextInt();
		System.out.println("Enter the Customer Name");
		custName=scanner.next();
		System.out.println("Enter the Customer Address");
		custAddress= scanner.next();
		Customer cust=new Customer(custId,custName,custAddress);
		Account acct=new Account(acctId,acctType,acctBalance,cust);
		acct.display();
		scanner.close();
	}

}
