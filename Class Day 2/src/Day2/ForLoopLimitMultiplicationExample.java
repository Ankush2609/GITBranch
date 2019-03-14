package Day2;

import java.util.Scanner;

public class ForLoopLimitMultiplicationExample {

	public static void main(String[] args) {
		
		int no;
		int limit;
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		no = sc.nextInt();
		
		System.out.println("Enter a limit: ");
		limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			value = no*i;
			System.out.println(no+"*"+i+"="+value);
		}
		sc.close();
	}

}
