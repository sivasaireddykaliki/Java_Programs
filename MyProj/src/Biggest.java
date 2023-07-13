import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1,n2,n3,big;
		System.out.println("Enter the three numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		big=(n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("Largest Number = "+big);
		s.close();
	}

}
