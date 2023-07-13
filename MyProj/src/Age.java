import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=s.nextInt();
		if (age<0)
			System.out.println("Invalid Age");
		else
			if (age>=18)
				System.out.println("Major");
			else
				System.out.println("Minor");
		s.close();

	}

}
