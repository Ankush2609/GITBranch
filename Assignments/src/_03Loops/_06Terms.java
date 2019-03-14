package _03Loops;

import java.util.Scanner;

public class _06Terms {
	public static void main(String[]args)
	{
		int term;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term: ");
		term = sc.nextInt();
		
		for(int i=1;i<=term;i++)
		{
			System.out.println(2*i-1);
			sum=sum+2*i-1;
		}
		System.out.println("sum"+sum);
		sc.close();
		
	}
}