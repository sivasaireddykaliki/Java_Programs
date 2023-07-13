import java.util.Scanner;

public class Array_Big_Small {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,small,big,sec_small,sec_big;
		System.out.println("Enter the size of array");
		n=scanner.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" values of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		small=Integer.MAX_VALUE;big=Integer.MIN_VALUE;sec_small=Integer.MAX_VALUE;sec_big=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if (big<arr[i])
			{
				sec_big=big;
				big=arr[i];	
			}
			
			if (sec_big<arr[i] && arr[i]!=big)
			{
				sec_big=arr[i];
			}
			
			if (small>arr[i])
			{
				sec_small=small;
				small=arr[i];
			}
			if (sec_small>arr[i] && arr[i]!=small)
			{
				sec_small=arr[i];
			}
		}
		
		if (sec_small==Integer.MAX_VALUE && sec_big==Integer.MIN_VALUE)
		{ //if all input values are same
			sec_small=small;
			sec_big=big;
		}
		System.out.println("Big = "+big);
		System.out.println("Small = "+small);
		System.out.println("Second Big = "+sec_big);
		System.out.println("Second Small = "+sec_small);
		scanner.close();
	}

}
