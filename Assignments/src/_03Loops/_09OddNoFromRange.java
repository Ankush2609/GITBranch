package _03Loops;

import java.util.Scanner;

public class _09OddNoFromRange {

	public static void main(String[] args) {
		
		int Start;
		int End;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start range interger: ");
		
		while(!sc.hasNextInt())
		{
			System.out.println("Invalid no. please try again");
			sc.next();
		}
		Start = sc.nextInt();
		
		System.out.println("Enter End range interger: ");
		
		while(!sc.hasNextInt())
		{
			System.out.println("Invalid no. please try again");
			sc.next();
		}
		End = sc.nextInt();
				
		for(int i=Start;i<=End;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even: "+i);
			}
			else
			{
				System.out.println("Odd: "+i);
			}
		}
		sc.close();
	}

}
