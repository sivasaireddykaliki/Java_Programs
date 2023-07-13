// Program 4

import java.util.Scanner;

class Rectangle{
	int length;
	int breadth;
	int area;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void calculate_area()
	{
		area=length*breadth;
		
	}
}
public class Rectangle_Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length,breadth;
		length=scanner.nextInt();
		breadth=scanner.nextInt();
		Rectangle rectangle=new Rectangle(length, breadth);
		rectangle.calculate_area();
		System.out.println("Area of Rectangle is "+rectangle.area);
		scanner.close();
	}

}
