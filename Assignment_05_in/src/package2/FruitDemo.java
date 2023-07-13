// Program 9

package package2;

import java.util.Scanner;



interface Fruit
{
	
	void cost();
}

class Apple implements Fruit
{

	double unit_price;
	int quantity;
	String name;
	double total_price;
	Apple(double unit_price,String name,int quantity)
	{
		this.unit_price=unit_price;
		this.name=name;
		this.quantity=quantity;
	}
   public void cost()
   {
	   total_price=unit_price*quantity;
	   System.out.println("Cost of Apples named "+name+" is "+total_price);
   }
}

class Mango implements Fruit
{
	double unit_price;
	int quantity;
	String name;
	double total_price;
	Mango(double unit_price,String name,int quantity)
	{
		this.unit_price=unit_price;
		this.name=name;
		this.quantity=quantity;
	}
   public void cost()
   {
	   total_price=unit_price*quantity;
	   System.out.println("Cost of Mangoes named "+name+" is "+total_price);
   }
}


public class FruitDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Apple Details:");
		double apple_up,mango_up;
		int apple_quant,mango_quant;
		String apple_name,mango_name;
		System.out.println("Enter the Apple Name");
		apple_name=scanner.next();
		System.out.println("Enter the Apple Unit Price");
		apple_up=scanner.nextDouble();
		System.out.println("Enter the Number of Apples");
		apple_quant=scanner.nextInt();
		Apple apple = new Apple(apple_up, apple_name, apple_quant);
		System.out.println("Enter the Mango Details");
		System.out.println("Enter the Mango Name");
		mango_name=scanner.next();
		System.out.println("Enter the Mango Unit Price");
		mango_up=scanner.nextDouble();
		System.out.println("Enter the Number of Mangoes");
		mango_quant=scanner.nextInt();
		Mango mango=new Mango(mango_up, mango_name,mango_quant);
		apple.cost();
		mango.cost();
		scanner.close();

	}

}
