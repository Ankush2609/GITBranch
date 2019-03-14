package _03Loops;

import java.util.Scanner;

public class _05CubeUptoNo {

	public static void main(String[] args) {

		int no=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :");
		no = sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			int cube = i*i*i;
			System.out.println(i+"* "+i+"* "+i+"= "+cube);
		}
		sc.close();
	}

}
