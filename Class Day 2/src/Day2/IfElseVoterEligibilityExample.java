package Day2;
import java.util.Scanner;
public class IfElseVoterEligibilityExample {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the user: ");
		age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Cool...You are eligibible...!!!");
		}
		else
		{
			System.out.println("Sorry...You are not eligible..!!!");
		}
	sc.close();	
	}

}
