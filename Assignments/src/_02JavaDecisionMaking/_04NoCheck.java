package _02JavaDecisionMaking;

import java.util.Scanner;

public class _04NoCheck {

	public static void main(String[] args) {
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.: ");
		no = sc.nextInt();
		
		if(no>0)
		{
			System.out.println("Positive");
		}
		else if(no<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
		
		sc.close();
	}

}
