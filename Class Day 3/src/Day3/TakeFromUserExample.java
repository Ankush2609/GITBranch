package Day3;

import java.util.Scanner;

public class TakeFromUserExample {

	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		
		//Ask size
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		
		//Declare Array
		int arr[] = new int [size];
		
		//Enter element
		System.out.println("Enter the element: ");
		for(int i =0; i< size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Display element
		System.out.println("Your elements: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		//Display element
				System.out.println("Your elements: ");
				for(int a:arr)
				{
					System.out.println(a);
				}
				sc.close();
	}

}
