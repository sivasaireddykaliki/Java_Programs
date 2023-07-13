package com.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class List_Program {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<Integer>(); //accept only integers
		int choice,element,index;
		Scanner scanner=new Scanner(System.in);
		try
		{
			
		while(true)
		{
			System.out.println("List of operations");
			System.out.println("1. Add element at last");
			System.out.println("2. Add element at first");
			System.out.println("3. Add element at given index");
			System.out.println("4. Update element at given index");
			System.out.println("5. Delete the first element");
			System.out.println("6. Delete the last element");
			System.out.println("7. Delete the given element");
			System.out.println("8. Delete the element at given index");
			System.out.println("9. Display the elements");
			System.out.println("10.Exit");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter element to add at end of list");
					element=scanner.nextInt();
					ll.addLast(element);
					break;
				case 2:
					System.out.println("Enter element to add at beginning of list");
					element=scanner.nextInt();
					ll.addFirst(element);
					break;
				case 3:
					System.out.println("Enter element and index values as input to add element");
					element=scanner.nextInt();
					index=scanner.nextInt();
					ll.add(index, element);
					break;
				case 4:
					System.out.println("Enter element and index values as input to update element");
					element=scanner.nextInt();
					index=scanner.nextInt();
					ll.set(index,element);
					break;
				case 5:
					if(ll.size()==0)
					{
					   System.out.println("List is empty");	
					}
					else
					{
					System.out.println("First element "+ll.removeFirst()+ " is removed");
					}
					break;
				case 6:
					if(ll.size()==0)
					{
					   System.out.println("List is empty");	
					}
					else
					{
					System.out.println("Last element "+ll.removeLast()+ " is removed");
					}
					break;	
				case 7:
					System.out.println("Enter element to be removed");
					element=scanner.nextInt();
					boolean isremoved = ll.remove(Integer.valueOf(element));
					if (isremoved)
					{
						System.out.println("Element is removed");
					}
					else
					{
						System.out.println("Element not found");
					}
					break;
				case 8:
					System.out.println("Enter index place to remove element");
					index=scanner.nextInt();
					if(ll.size()==0)
					{
					   System.out.println("List is empty");	
					}
					else if (index<0 || index>=ll.size())
					{
						System.out.println("Out of bounds index");
					}
					else
					{
					Integer removed_element = ll.remove(index);
					System.out.println("Removed element is "+removed_element);
					}
					break;
				case 9:
					System.out.println("Elements in Linked List ");
					for(Integer i:ll)
					{
						System.out.print(i+"  ");
					}
					System.out.println();
					break;
				case 10:
					scanner.close();
					System.exit(1);
				default:
					System.out.println("Wrong choice");
					break;
			}
			System.out.println();
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured : ");
		}
	
	}

}
