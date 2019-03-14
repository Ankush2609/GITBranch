package Day3;

import java.util.Scanner;

public class AdditionOfTwoArrayExample {
	
public static void main(String []args){
	
	int arr3[][] = new int[3][3];
	
	int row1,row2,row3;
	int col1,col2,col3;

	Scanner sc = new Scanner(System.in);
	
	//ASK for Array 1
	System.out.println("Enter row Count for Array 1: ");
	row1 = sc.nextInt();
	
	System.out.println("Enter column count for Array 1: ");
	col1 = sc.nextInt();
	
	//ASK for Array 2
	System.out.println("Enter row Count for Array 2: ");
	row2 = sc.nextInt();
	
	System.out.println("Enter column count for Array 2: ");
	col2 = sc.nextInt();
	
	if(row1==row2 && col1==col2)
	{
		//DECLARE
		int arr1[][] = new int[row1][col1];
		int arr2[][] = new int[row2][col2];
		row3=row2;
		col3=col2;
		
		
		//TAKE VALUE
		System.out.println("Enter the Elements for Array 1: ");
		for(int i=0;i<row1;i++)
		{
			for(int j =0;j<col1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		//TAKE VALUE
		System.out.println("Enter the Elements for Array 2: ");
		for(int i=0;i<row2;i++)
		{
			for(int j =0;j<col2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}	
		
		//Print VALUE
		System.out.println("Array 1 elements are: ");
		for(int i=0;i<row1;i++)
		{
			for(int j =0;j<col1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Print VALUE
		System.out.println("Array 2 elements are: ");
		for(int i=0;i<row2;i++)
		{
			for(int j =0;j<col2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}	
		
		//ADDITION
		System.out.println("Enter the Elements for Array 1 & Array 2: ");
		for(int i=0;i<row3;i++)
		{
			for(int j=0;j<col3;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
	else {
	     System.out.println("row and column are not equal");
	     	}
	
	
	sc.close();
}
}
