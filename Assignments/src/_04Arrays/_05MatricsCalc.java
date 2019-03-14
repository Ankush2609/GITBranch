package _04Arrays;

import java.util.Scanner;

public class _05MatricsCalc {

	public static void main(String[] args) {
		
		char choice=0;
		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int [3][3];
		int[][] arr2 = new int [3][3];
		int[][] arr3 = new int [3][3];
		
		//Input for array 1
		System.out.println("Enter element for array 1: ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("**************");
		
		//Input for array 2
		System.out.println("Enter element for array 2: ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("**************");
		
		//Print Array 1
		System.out.println("Array 1");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**************");
		
		//Print Array 2
		System.out.println("Array 2");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**************");
		
		//Take choice from user
		while(choice!='d')
		{
			 System.out.println("Enter the choice: "+"\n"+
								"a) Add two matrices"+"\n"+
								"b) Subtract two matrices"+"\n"+
								"c)multiply two matrices"+"\n"+
								"d) Exit");
			 choice = sc.next().charAt(0);
		
			 switch(choice)
			 {
			 case 'a':
			 {
				 //Addition
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							arr3[i][j] = arr1[i][j]+arr2[i][j];
						}
					}
				 //display
				 System.out.println("Addition: ");
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							System.out.print(arr3[i][j]+" ");
						}
						System.out.println();
					}
			 }
			 break;
			 
			 case 'b':
			 {
				 //Subtraction
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							arr3[i][j] = arr1[i][j]-arr2[i][j];
						}
					}
				 //display
				 System.out.println("Subraction: ");
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							System.out.print(arr3[i][j]+" ");
						}
						System.out.println();
					}
			 }
			 break;
			 
			 case 'c':
			 {
				 //Multiplication
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							arr3[i][j] = arr1[i][j]*arr2[i][j];
						}
					}
				 //display
				 System.out.println("Multiplication: ");
				 for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							System.out.print(arr3[i][j]+" ");
						}
						System.out.println();
					}
			 }
			 break;
			 
			 case 'd':
			 {
				 //Multiplication
				System.exit(0);
			 }
			 break;
			 
			 default:
			 {
				 System.out.println("Invalid Argument. Please try again");
			 }
			 }
			
		}

	}
}