package Day2;

import java.util.Scanner;

public class ForLoopFactroialExample {
	public static void main(String[]args) {
		
		int no;
		int factorial=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		no = sc.nextInt();
		
		for(int i =no; i>=1;i--)//for(int i=1;i<=no;i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
