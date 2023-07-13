// Program 3
import java.util.Scanner;

class Account_Con{
	int accountNo;
	String accountType;
	int accountBalance;

	Account_Con(int accountNo, String accountType, int accountBalance)
	{
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	
	public void withdraw(int amount)
	{
		if(amount<=accountBalance)
		accountBalance=accountBalance-amount;
		else
		System.out.println("Withdraw Limit Exceeded. Insufficient Balance");
	}
	
	public void deposit(int amount)
	{
		accountBalance+=amount;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Details ");
		System.out.println("Account Number :"+accountNo);
		System.out.println("Account Type:"+accountType);
		System.out.println("Account Balance:"+accountBalance);
		System.out.println();
	}
}
public class Account_Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int accountNo;
		String accountType;
		int accountBalance;
		System.out.println("Enter the Account Details");
		System.out.println("Enter the Account Number");
		accountNo=scanner.nextInt();
		System.out.println("Enter the Account Type");
		accountType=scanner.next();
		System.out.println("Enter the Account Balance");
		accountBalance=scanner.nextInt();
		Account_Con acc=new Account_Con(accountNo, accountType, accountBalance);
		while(true)
		{
		System.out.println("Enter any of the below numbers for follwing operations");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Display Account Details");
		System.out.println("4. Exit/ Terimate Application");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Enter the amount to witdraw");
			int withdraw_amt=scanner.nextInt();
			acc.withdraw(withdraw_amt);
			break;
		case 2:
			System.out.println("Enter the amount to deposit");
			int deposit_amt=scanner.nextInt();
			acc.deposit(deposit_amt);
			break;
		case 3:
			acc.displayAccountDetails();
			break;
		case 4: System.exit(1);
				scanner.close();
				break;
		}
		
		}
		
	}

}
