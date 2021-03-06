package bankCounter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bank {

	// has some predefined customers
	// but to make this a simulation we will need the total cash of all these customers to be
	// greater than the initial bank balance
	
	
	private Customer[] customers;
	
	private Random random;
	
	private int bankBalance;
	
	// has a queue of transactions
	Queue<Transaction> queue;
	
	public Bank(int noOfCustomers, int initialBalance)
	{
		
		customers = new Customer[noOfCustomers];
		bankBalance = initialBalance;
		queue = new ArrayDeque<>();
		
		// initialize balance of customers randomly ranging between 1000 and 10000
		random = new Random();
		for (int i = 0; i < customers.length; i++) 
		{
			int randomNo = random.nextInt(10 - 1) + 1;
			customers[i] = new Customer(i, randomNo * 1000);
		}
		
		// you can use this to check initialization of customers
//		for (int i = 0; i < customers.length; i++) {
//			System.out.println(customers[i]);
//		}
	
	}
	
	// deposit method
	public void deposit(int id, int amount)
	{
		System.out.println("Before: "+customers[id]);
		bankBalance += amount;
		int savings = customers[id].getSavings() + amount;
		customers[id].setSavings(savings);
		System.out.println(customers[id]);
		System.out.println("Current Bank Balance: "+bankBalance);
		
	}
	
	// withdrawal method
	public boolean withdrawal(int id, int amount)
	{
		// first check whether the bank has sufficient balance
		if(bankBalance < amount)
		{
			System.out.println("Insufficient Cash in bank");
			return false;
		
		}
		
		
		// now check whether the customer has sufficient balance
		// this condition is just added for fun
		// but we will assume that the user will not enter such amount
		// since you are going to show the customer his current balance
		int savings = customers[id].getSavings();
		if(savings < amount)
		{
			System.out.println("Sorry you don't have sufficient balance");
			return false;
		}
		
		// update bankBalance and customerSaving
		
		System.out.println("Before: "+customers[id]);
		bankBalance -= amount;
				
		savings -= amount;
		customers[id].setSavings(savings);		
		System.out.println("After: "+customers[id]);
		System.out.println("Current Bank Balance: "+bankBalance);
		
		return true;
	}
	
	// add transaction to the queue
	public void enqueue(int customerId, TransactionType transType, int transAmount)
	{
		Transaction transaction = new Transaction(customerId, transType, transAmount);
		queue.add(transaction);
		System.out.println("Transaction added to the queue");
	}
	
	
	// remove transaction from the queue
	public boolean dequeue() {
		
		Transaction transaction = queue.remove();
		
		int id = transaction.getCustomerId();
		int transAmount = transaction.getTransAmount();
		
		// check the transaction type and perform the transaction Type
		if(transaction.getTransType() == TransactionType.DEPOSIT)
		{
			deposit(id, transAmount);
			return true;
		}
		else
		{
			return withdrawal(id, transAmount);
		}
				
	}
	
	public int queueSize()
	{
		return queue.size();
	}
	
	public String getCustomerDetails(int id)
	{
		return customers[id].toString();
	}
}