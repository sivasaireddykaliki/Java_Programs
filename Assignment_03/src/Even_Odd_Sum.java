import java.util.Scanner;

public class Even_Odd_Sum {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int sumEven=0, sumOdd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				sumEven+=i;
			else
				sumOdd+=i;
		}
	    System.out.println("Sum of Even Numbers = "+sumEven);
	    System.out.println("Sum of Odd Numbers = "+sumOdd);
		scanner.close();

	}

}
