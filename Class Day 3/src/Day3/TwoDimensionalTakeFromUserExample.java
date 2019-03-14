package Day3;

import java.util.Scanner;

public class TwoDimensionalTakeFromUserExample {

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
		System.out.println("your array has row: "+arr.length);
		//System.out.println("your array has row: "+arr[j].length);

		System.out.println("Your Array Looks like below: ");
		for(int i=0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
