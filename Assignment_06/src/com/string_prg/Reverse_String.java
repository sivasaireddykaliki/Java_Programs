package com.string_prg;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String in single line ");
		String str = scanner.nextLine();
		String[] str_array=str.split(" ");
		String rev_str="";
		for(int ind=0;ind<str_array.length;ind++)
		{
			String s= str_array[ind];
			for(int i=s.length()-1;i>=0;i--)
			{
				rev_str+=s.charAt(i);
			}
			if(ind==str_array.length-1)
				break;
			else
				rev_str+=" ";
		}
		System.out.println("Resultant String of Reversed Words is \n"+rev_str);
		scanner.close();

	}

}
