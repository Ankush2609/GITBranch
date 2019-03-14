package Day2;

import java.util.Scanner;

public class ForLoopSquareAndSumExample {

	public static void main(String[] args) {

		int range;
		int square;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range: ");
		range = sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			square = i*i;
			System.out.println(square);
			sum = sum+square;
		}
		
		System.out.println("Sum: "+sum);
		sc.close();
	}
}
