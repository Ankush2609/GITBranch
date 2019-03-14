package _04Arrays;

import java.util.Scanner;

public class _03_OddEvenPrint {

	public static void main(String[] args) {
	
	int size;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array: ");
	size = sc.nextInt();
	int []arr= new int[size];
	
	System.out.println("Enter the element of array: ");
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int j=0;j<size;j++)
	{
		if(arr[j]%2==0)
		{
			System.out.println("Even: "+arr[j]);
		}
		else
		{
			System.out.println("Odd: "+arr[j]);
		}
	}
	sc.close();
	}

}
