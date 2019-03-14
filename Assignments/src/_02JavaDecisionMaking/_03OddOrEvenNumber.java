package _02JavaDecisionMaking;

import java.util.Scanner;

public class _03OddOrEvenNumber {

	public static void main(String[] args) {
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.: ");
		no = sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		sc.close();
	}

}
