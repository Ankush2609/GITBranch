package _03Loops;

import java.util.Scanner;

public class _07CountDigit {

	public static void main(String[] args) 
	{
		int no;
		int digit=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		no = sc.nextInt();
		
		if(no<0)
		{
			System.out.println("Negative");
		}
		else if(no==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Positive");
			
			while(no>0)
			{
				no = no/10;
				digit = digit+1;
			}
		System.out.println("digit: "+digit);	
		}
		sc.close();
	}
}