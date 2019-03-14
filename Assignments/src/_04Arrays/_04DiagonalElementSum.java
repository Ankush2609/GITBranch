package _04Arrays;

import java.util.Scanner;

public class _04DiagonalElementSum {

	public static void main(String[] args) {

		int sum=0;
		int arr[][] = new int[4][4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of array: ");
		
		//input
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{

				arr[i][j] = sc.nextInt();
			}
		}
		
		//print
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal element: "+sum);
	}

}
