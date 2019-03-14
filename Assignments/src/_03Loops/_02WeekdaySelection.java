package _03Loops;

import java.util.Scanner;

public class _02WeekdaySelection {

	public static void main(String[] args) {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Day :"+"\n"+
						   "1. Sunday"+"\n"+
						   "2. Monday"+"\n"+
						   "3. Tuesday"+"\n"+
						   "4. Wednesday"+"\n"+
						   "5. Thursday"+"\n"+
						   "6. Friday"+"\n"+
						   "7. Saturday");
		
		System.out.println("\n"+"Enter your selection: ");
		year = sc.nextInt();
		
		switch(year)
		{
		case 1:
		{
			System.out.println("You have selected Sunday");
		}
		break;
		
		case 2:
		{
			System.out.println("You have selected Monday");
		}
		break;
		
		case 3:
		{
			System.out.println("You have selected Tuesday");
		}
		break;
		
		case 4:
		{
			System.out.println("You have selected Wednesday");
		}
		break;
		
		case 5:
		{
			System.out.println("You have selected Thursday");
		}
		break;
		
		case 6:
		{
			System.out.println("You have selected Friday");
		}
		break;
		
		case 7:
		{
			System.out.println("You have selected Saturday");
		}
		break;
		
		default:
		{
			System.out.println("You have selected worng data");
		}
		}
		
		sc.close();

	}

}
