package _02JavaDecisionMaking;

import java.util.Scanner;

public class _02LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int no1;
		int no2;
		int no3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. 1: ");
		no1 = sc.nextInt();
		System.out.println("Enter No. 2: ");
		no2 = sc.nextInt();
		System.out.println("Enter No. 3: ");
		no3 = sc.nextInt();
		
		if(no1 > no2 && no1 > no3)
		{
			System.out.println("No. 1 is gerater than No. 2 and No. 3");
		}
		else if(no2 > no1 && no2 > no2)
		{
			System.out.println("No. 2 is gerater than No. 1 and No. 3");
		}
		else
		{
			System.out.println("No. 3 is greater than No. 1 & No. 2");
		}
		sc.close();
	}

}
