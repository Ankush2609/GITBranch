package _03Loops;

import java.util.Scanner;

public class _03NumberOfDaysFromMonths {

	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Month :"+"\n"+
						   "1. January"+"\n"+
						   "2. February"+"\n"+
						   "3. March"+"\n"+
						   "4. April"+"\n"+
						   "5. May"+"\n"+
						   "6. June"+"\n"+
						   "7. July"+"\n"+
						   "8. August"+"\n"+
						   "9. September"+"\n"+
						   "10. Octoember"+"\n"+
						   "11. November"+"\n"+
						   "12. December");
		
		System.out.println("\n"+"Enter your selection: ");

		while(!sc.hasNextInt())
		{
			System.out.println("Invalid input. Please try again");
			sc.next();
		}
		
		year = sc.nextInt();
				
		switch(year)
		{
		case 1:
		{
			System.out.println("January = 31 Days");
		}
		break;
		
		case 2:
		{
			System.out.println("February = 28 Days");
		}
		break;
		
		case 3:
		{
			System.out.println("March = 31 Days");
		}
		break;
		
		case 4:
		{
			System.out.println("April = 30 Days");
		}
		break;
		
		case 5:
		{
			System.out.println("May = 31 Days");
		}
		break;
		
		case 6:
		{
			System.out.println("June = 30 Days");
		}
		break;
		
		case 7:
		{
			System.out.println("July = 31 Days");
		}
		break;
		
		case 8:
		{
			System.out.println("August = 31 Days");
		}
		break;
		
		case 9:
		{
			System.out.println("September = 30 Days");
		}
		break;
		
		case 10:
		{
			System.out.println("Octoember = 31 Days");
		}
		break;
		
		case 11:
		{
			System.out.println("November = 30 Days");
		}
		break;
		
		case 12:
		{
			System.out.println("December = 31 Days");
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
