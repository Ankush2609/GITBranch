package Day1SelfStudy;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//Way 1: To get input from user using Scanner and System.in
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.next();
		System.out.println("User Name: "+name);
		
		System.out.println("Enter the Password: ");
		String password = sc.next();
		System.out.println("Password: "+password);
		
		System.out.println("Enter the Amount: ");
		int amount = sc.nextInt();
		System.out.println("Password: "+amount);
		sc.close();

	}
}