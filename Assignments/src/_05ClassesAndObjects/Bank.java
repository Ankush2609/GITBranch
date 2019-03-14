package _05ClassesAndObjects;

import java.util.Scanner;

public class Bank {
	int account_no;
	String name;
	int withdraw;
	int amount=0;
	int choice;
	
	Scanner sc = new Scanner(System.in);
	
	void insertData()
	{

		System.out.println("Enter Account No.: ");
		account_no = sc.nextInt();
		System.out.println("Enter Account holder name: ");
		name = sc.next();
		System.out.println("Enter amount: ");
		amount = sc.nextInt();
	}
	int deposit()
	{
		System.out.println("Enter amount need to be deposit: ");
		amount = amount + sc.nextInt();
		System.out.println("Updated Balance: "+amount);
		return amount;
	}
	int withdraw()
	{
		System.out.println("Enter amount need to be withdraw: ");
		withdraw = sc.nextInt();
		System.out.println("withdrawal Amount :"+withdraw);
		System.out.println("Available Amount :"+amount);
		while(amount<withdraw)
		{
			System.out.println("Insufficient balance. Please enter amount less than or equal to "+amount);
			withdraw = sc.nextInt();
		}
		//withdraw = sc.nextInt();
		amount = amount - withdraw;
		System.out.println("Updated Balance: "+amount);
		return amount;
	}
	int checkBalance()
	{
		System.out.println("Account balance: "+amount);
		return amount;
	}
	void displayDetails()
	{
		System.out.println("\n"+"Account details: ");
		System.out.println("Account  No.: "+account_no+"\n"+
						   "Account holder Name: "+name+"\n"+
						   "Account Balance: "+amount);
	}
}
