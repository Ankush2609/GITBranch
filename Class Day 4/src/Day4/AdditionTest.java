package Day4;

import java.util.Scanner;

public class AdditionTest {

	public static void main(String[] args) {

		Addition a = new Addition();
		//without Scanner
		int sum = a.add(10, 20);
		System.out.println("Addition: "+sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		//SYSOUT + is Concat
		System.out.println("Addition as per user: "+num1+num2);
		// PARA + is Addition
		System.out.println("Addition as per user: "+(num1+num2));
	}

}
