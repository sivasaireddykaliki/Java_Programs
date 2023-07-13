package com.string_prg;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isPalindrome=true;
		System.out.println("Enter the String to check if its palindrome or not : ");
		String str = scanner.next();
		int start=0,end=str.length()-1;
		while(true)
		{
			if(start>end)
				break;
			if(str.charAt(start)!=str.charAt(end))
			{
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome)
			System.out.println("Given String "+str+" is Palindrome");
		else
			System.out.println("Given String "+str+" is not Palindrome");
		scanner.close();
	}

}
