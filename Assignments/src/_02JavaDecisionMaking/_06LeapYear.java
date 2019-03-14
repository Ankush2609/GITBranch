package _02JavaDecisionMaking;

import java.util.Scanner;

public class _06LeapYear {

	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 &&  year%400==0 )
		{
			System.out.println("Leap year");
		}
		else {
			System.out.println("Non-leap year");
		}
		sc.close();
	}

}
