package Day3;

import java.util.Scanner;

public class SumOfAllElementExample {

	public static void main(String[] args) {
		int size;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		//ASK size
		System.out.println("Enter the size: ");
		size = sc.nextInt();
		
		//DECLARE array
		int arr[] = new int[size];
		
		//TAKE VAUE
		System.out.println("Enter the element: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//CALCULATE SUM
		for(int i=0;i<size;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of all element: "+sum);
		sc.close();
	}
	
}
