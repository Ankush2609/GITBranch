package _05ClassesAndObjects;

import java.util.Scanner;

public class BankTest 
{

	public static void main(String[] args) {
		
		int Choice;
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****Welcome to Online Banking*****"+"\n"+
							"1. Enter Account Details"+"\n"+
						    "2. Deposit Amount"+"\n"+
							"3. Withdraw Amount"+"\n"+
						    "4. Check balance"+"\n"+
							"5. Display my Account Details"+"\n"+
						    "6. Exit from online banking"+"\n"+
							"*********************************");
		
		System.out.println("Enter your Choice: ");
		Choice = sc.nextInt();
		
		while(Choice!=6)
		{	
			switch(Choice)
			{
				case 1:
				{
					b.insertData();
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();	
				}
				break;
				
				case 2:
				{
					b.deposit();
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();
				}
				break;
				
				case 3:
				{
					b.withdraw();
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();
				}
				break;
				
				case 4:
				{
					b.checkBalance();
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();
				}
				break;
				
				case 5:
				{
					b.displayDetails();
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();
				}
				break;
				
				case 6:
				{
					System.exit(Choice);
					System.out.println("*********************************");
					System.out.println("Enter your Choice: ");
					Choice = sc.nextInt();
				}
				break;
				
				default:
				{
					System.out.println("Invalid option");
				}
			}
		}
		sc.close();
	  }
	}