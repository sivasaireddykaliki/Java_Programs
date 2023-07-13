package com.string_prg;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int consonant=0,vowel=0,words=0;
		System.out.println("Enter the String in single line : ");
		String str = scanner.nextLine();
		String arr[]=str.split(" ");
		for(String s: arr)
		{
			s=s.toLowerCase();
			
			for(int i=0;i<s.length();i++)
			{
				char ch;
				ch=s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vowel++;
				else if (ch>='0' && ch<='9')
					continue;
				else
					consonant++;
			}
			words++;
		}
		System.out.println("Number of words : "+ words);
		System.out.println("Number of Consonants : "+consonant);
		System.out.println("Number of Vowels : "+vowel);
		scanner.close();

	}

}
