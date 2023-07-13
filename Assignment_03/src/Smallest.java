import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int small=Integer.MAX_VALUE,i=1,number;
		while(i<=10)
		{
			System.out.println("Enter the number");
			number=scanner.nextInt();
			if (number<small)
				small=number;
			i++;
		}
		System.out.println("Smallest Number = "+small);
		scanner.close();

	}

}
