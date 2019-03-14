package Day2;

import java.util.Scanner;

public class WhileLoopRangePrintExample {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.: ");
		i = sc.nextInt();
		
		while(i<=50)
		{
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
