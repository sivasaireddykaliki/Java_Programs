// Program 3
import java.util.Scanner;

class Student_Con{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	Student_Con(int rollNum, String studName, int mark1, int mark2, int mark3)
	{
		this.rollNum=rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void calculateTotal()
	{
		totalMarks=mark1+mark2+mark3;
	}
	
	public void displayStudDetails()
	{
		System.out.println("Student Details ");
		System.out.println("Roll Num :"+rollNum);
		System.out.println("Student Name:"+studName);
		System.out.println("Total Marks:"+totalMarks);
	}
}
public class StudentDemo_Constructor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int  rollNum,mark1,mark2,mark3;
		String studName;
		System.out.println("Enter the Student Details");
		System.out.println("Enter the roll Number");
		rollNum=scanner.nextInt();
		System.out.println("Enter the Student Name");
		studName=scanner.next();
		System.out.println("Enter the 3 subject marks of student");
		mark1=scanner.nextInt();
		mark2=scanner.nextInt();
		mark3=scanner.nextInt();
		Student_Con std=new Student_Con(rollNum, studName, mark1, mark2, mark3);
		std.calculateTotal();
		std.displayStudDetails();
		scanner.close();
	}

}
