package Day3;

import java.util.Scanner;

public class PrintOddNoFromArrayExample {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		
		//Ask size
		System.out.println("Enter the size: ");
		size = sc.nextInt();
		
		//Declare
		int arr[] = new int[size];
		
		//Value
		System.out.println("Enter the Value: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//ODD
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
