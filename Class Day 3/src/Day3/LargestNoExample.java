package Day3;

import java.util.Scanner;

public class LargestNoExample {

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
		
		//Largest
		int max=arr[0];
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		System.out.println("Largest no is: "+max);
		sc.close();
	}
}
