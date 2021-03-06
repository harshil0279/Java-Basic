package Linkedlist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderedLinkedListDemo {
	
	String filePath = "/home/bridgeit/Desktop/oLinkedListFeeder.txt";
	
	OrderedLinkedList oList;

	public static void main(String[] args) throws IOException {
		
		OrderedLinkedListDemo uDemo = new OrderedLinkedListDemo();
				
		// populate the linkedList
		uDemo.populate();
		
		System.out.println("This is a demo of Ordered Linked List");
		
		String choice = "n";
		
		int option;
		
		// keep asking user what to do until he wants to exit
		try(Scanner sc = new Scanner(System.in))
		{
		// keep the program running until user wants to quit
		do
		{
		System.out.println("Please enter your choice");
		System.out.println("1.Search/Insert a Number");
		System.out.println("2.Display list of Numbers");
		
		option = sc.nextInt();
		
		switch (option) 
		{
		case 1:System.out.println("Enter the value to be inserted");
			   int no = sc.nextInt();			   			   
			   uDemo.addToList(no);
			   System.out.println("Enter 'y' to continue or 'n' no exit");
			   choice = sc.next();
			break;
			
		case 2:uDemo.display();
			   System.out.println("Enter 'y' to continue or 'n' no exit");
			   choice = sc.next();
			break;
		
		default: System.out.println("Incorrect input. Please enter a correct input.");
		
		}
		
		}
		while(choice.equalsIgnoreCase("y"));		
		
		}
				 
				
		// save the list back
		uDemo.saveFileOnExit();

	}

	private void populate() throws IOException {
		
		oList = new OrderedLinkedList();
		
		WordReaderWriter wReader = new WordReaderWriter();
		
		List<Integer> intList = wReader.getIntegerList(filePath);
		
		// System.out.println(wordList);
		
		for(int i: intList)
		{
			oList.append(i);
		}
		
		// oList.display();
	}
	
	private void addToList(int no)
	{
		oList.insert(no);
	}
	
	private void display()
	{
		oList.display();
	}
	
	private void saveFileOnExit() throws IOException
	{
		WordReaderWriter writer = new WordReaderWriter();
		
		int[] numbers = oList.toIntegerArray();
		List<Integer> noList = new ArrayList<>();
		for (int number : numbers) {
			noList.add(number);
		}
		writer.writeIntegerList(noList, filePath);
	}

}