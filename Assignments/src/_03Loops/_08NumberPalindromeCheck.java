package _03Loops;

import java.util.Scanner;

public class _08NumberPalindromeCheck {

	public static void main(String[] args) {
		
		int r,no,temp;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		no = sc.nextInt();
		
		temp = no;
		
		while(no>0)
		{
			r = no%10;
			sum = (sum*10)+r;
			no = no/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome number ");    
		}
		else
		{
			 System.out.println("not palindrome");    
		}
		
		sc.close();
	} 

}
