package _03Loops;

import java.util.Scanner;

public class _01LeapYear {

	public static void main(String[] args) {

		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year to check leap ot not: ");
		
		while (!sc.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter a year: ");
            sc.next();
        }
         
        year = sc.nextInt();
         
        while (year < 1582) 
        {
            System.out.println("Invalid input. Please enter a year: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("Invalid input. Please enter the year: ");
                sc.next();
            }
            year = sc.nextInt();
        }
				
		if(year%4==0 && year%100==0 && year%400==0)
		{
			System.out.println("Year is leap year");
		}
		else 
		{
			System.out.println("Year is not leap year");
		}
		
		sc.close();
	}

}
