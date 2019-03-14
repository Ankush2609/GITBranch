package Day2;

import java.util.Scanner;

public class IfElseEvenOddCheckExample {

	//Decision statements: Relational Operator - Example
	
	public static void main(String[] args) {
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		no = sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println("No is Even");
		}
		else
		{
			System.out.println("No is odd");
		}
		sc.close();
	}

}
