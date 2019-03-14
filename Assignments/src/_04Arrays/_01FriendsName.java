package _04Arrays;

import java.util.Scanner;

public class _01FriendsName {

	public static void main(String[] args) {

		String [] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of your friends: ");
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.next();
		}

		System.out.println("*******");
		System.out.println("Name of your friends: ");
		for(String s: arr)
		{
			System.out.println(s);
		}
		sc.close();
		
	}

}
