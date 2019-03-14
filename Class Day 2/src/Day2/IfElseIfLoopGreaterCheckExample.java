package Day2;

import java.util.Scanner;

public class IfElseIfLoopGreaterCheckExample {

	public static void main(String[] args) {
		
		int firstno;
		int secondno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no.");
		firstno = sc.nextInt();
		
		System.out.println("Enter the second no.");
		secondno = sc.nextInt();
		
		if(firstno >secondno)
		{
			System.out.println("First is greater");
		}
		else if(secondno > firstno)
		{
			System.out.println("Second is greater");
		}
		else
		{
			System.out.println("Check the input");
		}
		sc.close();
	}

}
