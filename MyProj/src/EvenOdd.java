//june 15th
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		if (n%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

}
