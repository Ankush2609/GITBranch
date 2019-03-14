package _03Loops;

import java.util.Scanner;

public class _04VowelConsonantCheck {

	public static void main(String[] args) {
		
		char ch;
		int asciich;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charactor: ");		
		ch = sc.next().charAt(0);
		
		asciich = (int)ch;
		
		System.out.println(asciich);

		if((asciich < 65 || asciich > 90) && (asciich < 97 || asciich > 122))
		{
			System.out.println("Invalid charactor");
		}
		else 
		{
			if((asciich == 65|| asciich == 69||asciich == 73 ||asciich == 79 ||asciich == 85) ||
				   (asciich == 97|| asciich == 101||asciich == 105||asciich == 111 ||asciich == 117)
				  )
				{
					System.out.println("Vowel");
				}
				else
				{
					System.out.println("Consonant");
				}
		}
		
		sc.close();
	}

}
