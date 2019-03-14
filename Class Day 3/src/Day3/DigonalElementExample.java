package Day3;

import java.util.Scanner;

public class DigonalElementExample {

	public static void main(String[] args) {
		int row;
		int col;

		Scanner sc = new Scanner(System.in);
		
		//ASK
		System.out.println("Enter row Count: ");
		row = sc.nextInt();
		
		System.out.println("Enter column count: ");
		col = sc.nextInt();
		
		//DECLARE
		int arr[][] = new int[row][col];
		
		//TAKE VALUE
		System.out.println("Enter the Elements: ");
		for(int i=0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//PRINT
		System.out.println("Your diagonal elements: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]);
				}
				System.out.print("\t");
//				else {
//					//System.out.print(" ");
//				}
			}
			System.out.println();
		}
		sc.close();
	}

}
