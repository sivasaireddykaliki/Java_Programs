import java.util.Scanner;

public class Prime_Sum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		boolean isPrime;
		for(int i=2;i<=100;i++)
		{
			isPrime=prime(i);
			if(isPrime==true)
				sum+=i;
		}
		System.out.println("Sum of prime numbers from 2 to 100 is  = "+sum);
		scanner.close();

	}
	
	static boolean prime(int number) {
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number % i ==0)
				count++;
			if(count>2)
				return false;
		}
		if(count==2)
			return true;
		else
			return false;
	}

}
