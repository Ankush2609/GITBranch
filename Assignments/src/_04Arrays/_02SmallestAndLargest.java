package _04Arrays;

import java.util.Scanner;

public class _02SmallestAndLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int min=0;
		System.out.println("Enter the size of an Array");
		int no = sc.nextInt();
		int []arr = new int[no];
		
		System.out.println("Enter the Element of an Array: ");
		
		for(int i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		min=arr[0];
		max=arr[0];
				
		for(int i=0;i<no;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Minimum: "+min);
		System.out.println("Maxmimum: "+max);
		
		sc.close();
	}

}
