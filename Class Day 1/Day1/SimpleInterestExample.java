package Day1;

import java.util.Scanner;

public class SimpleInterestExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Priniple Amount: ");
		//int priniple = sc.nextInt();
		//System.out.println("Enter the Interest Rate: ");
		//float Rate = sc.nextFloat();
		//System.out.println("Enter the Terms in months: ");
		//int Term = sc.nextInt();
		
		float priniple = 85f;
		float Rate = 10.98f;
		int Term = 12;
		
		int SI1 = (int) ((priniple*Rate*Term)/100); //Type Casting
		
		float SI2 = ((priniple*Rate*Term)/100); //Type Casting
		
		System.out.println("Simple Interest: "+SI1);
		System.out.println("Simple Interest: "+SI2);
		sc.close();
	}

}
