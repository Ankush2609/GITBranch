package _02JavaDecisionMaking;

import java.util.Scanner;

public class _08WeekdaySelection {

	public static void main(String[] args) {
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No from 1 to 7: ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Sunday");
		}
		break;
		case 2:
		{
			System.out.println("Monday");
		}
		break;
		case 3:
		{
			System.out.println("Tuesday");
		}
		break;
		case 4:
		{
			System.out.println("Wednesdy");
		}
		break;
		case 5:
		{
			System.out.println("Thursday");
		}
		break;
		case 6:
		{
			System.out.println("Friday");
		}
		break;
		case 7:
		{
			System.out.println("Saturday");
		}
		break;
		
		default:
		{
			System.out.println("Invalid");
		}
		}
		sc.close();
	}

}
