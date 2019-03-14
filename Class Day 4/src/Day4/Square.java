package Day4;

import java.util.Scanner;

public class Square {
	
	int num;
	Scanner sc = new Scanner(System.in);
	
	int square()
	{
		System.out.println("Enter the no: ");
		num = sc.nextInt();
		return num*num;
		//System.out.println("test");
	}

}
