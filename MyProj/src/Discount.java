import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    int item_no;
	    String item_name;
	    double rate,price,net_price,discount;
	    int quantity;
	    System.out.println("Enter the item number, item name, rate and quantity ");
	    item_no=scanner.nextInt();
	    item_name=scanner.next();
	    rate=scanner.nextDouble();
	    quantity=scanner.nextInt();
	    price= rate*quantity;
	    if (price>=1000 && price<2000)
	    {
	    	discount=0.1 * price;
	    }
	    else
	    {
	    	if (price>=2000 && price<3000)
	    	{
	    		discount=0.15 * price;
	    	}
	    	else
	    	{
	    		if (price>=3000 && price<5000)
		    	{
		    		discount=0.2 * price;
		    	}
	    		else
	    		{
	    			if (price>=5000)
			    	{
			    		discount=0.25 * price;
			    	}
	    			else
	    			{
	    				discount=0;
	    			}
	    		}
	    	}
	    }
	    net_price=price-discount;
	    System.out.println("Item number = "+ item_no+", Item name = "+item_name+", Price = "+price+", Discount="+discount+", Net Price = "+net_price);
	    scanner.close();
	}

}
