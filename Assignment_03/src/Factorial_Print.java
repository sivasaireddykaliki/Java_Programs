

public class Factorial_Print {

	public static void main(String[] args) {
		

		int sum=0;
		System.out.println("--------------------");
		System.out.println("  Number  Factorial ");
		System.out.println("--------------------");
		/*logic */
		for(int i=1;i<=5;i++)
		{
			sum=sum+fact_print(i);
		}
		System.out.println("--------------------");
		System.out.println("    Sum =   "+sum);
		System.out.println("--------------------");	  
	}
	
	static int fact_print(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("    "+n+"         "+fact);
		return fact;
	}

}
