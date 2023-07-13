import java.util.Scanner;

public class Sum_Digit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number,sum=0,rem,temp;
		System.out.println("Enter the number");
		number=scanner.nextInt();
		temp=number;
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("Sum of Digits of number "+temp+" is  = "+sum);
		scanner.close();

	}

}
