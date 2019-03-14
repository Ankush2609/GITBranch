package _02JavaDecisionMaking;

import java.util.Scanner;

public class _01MaximumOfTwoNos {

	public static void main(String[] args) {

		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter no1: ");
		int no1=sc.nextInt();
		System.out.println("Enter no2: ");
		int no2=sc.nextInt();
		
		if(no1>no2)
		{
			System.out.println("No1 is greater");
		}
		
		else {
			System.out.println("No2 is greater");
		}
		sc.close();
	}

}
