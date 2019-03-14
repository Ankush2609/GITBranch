package Day2;

import java.util.Scanner;

public class IfElseIfLarestNo {

	//Decision statements: && Operator - Example
	
	public static void main(String[] args) {
		int no1;
		int no2;
		int no3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no A");
		no1 = sc.nextInt();
		
		System.out.println("Enter no B");
		no2 = sc.nextInt();

		System.out.println("Enter no C");
		no3 = sc.nextInt();
		
		if(no1 >no2 && no1 > no3)
		{
			System.out.println("No1 is greater");
		}
		else if(no2> no1 && no2>no3)
		{
			System.out.println("No2 is greater");
		}
		else
		{
			System.out.println("no3 is gerater");
		}
		sc.close();
	}

}
