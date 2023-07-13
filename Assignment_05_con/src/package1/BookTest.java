// Program 7

package package1;

import java.util.Scanner;

class Book
{
	int bno;
	String bname;
	double price;
	Book(int bno,String bname, double price)
	{
		this.bno=bno;
		this.bname=bname;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Book Details");
		System.out.println("Book Number : "+bno);
		System.out.println("Book Name : "+bname);
		System.out.println("Book Price : "+price);
	}
}

class SpecialEditionBook extends Book
{
	double discount;
	SpecialEditionBook(int bno,String bname, double price,double discount)
	{
		super(bno,bname,price);
		this.discount=discount;
	}
	public void display()
	{
		super.display();
		System.out.println("Book Discount : "+discount);
	}
}

public class BookTest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int bno;
		String bname;
		double price,discount;
		System.out.println("Enter the Book Details");
		System.out.println("Ener the Book Number");
		bno=scanner.nextInt();
		System.out.println("Enter the Book Name");
		bname=scanner.next();
		System.out.println("Enter the Book Price");
		price=scanner.nextDouble();
		System.out.println("Enter the Book Discount");
		discount=scanner.nextDouble();
		SpecialEditionBook seb= new SpecialEditionBook(bno, bname, price, discount);
		seb.display();
		scanner.close();
		
	}

}
