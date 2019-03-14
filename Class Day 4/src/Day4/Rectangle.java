package Day4;

import java.util.Scanner;

public class Rectangle {
	int length;
	int breath;
	
	void intput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		length = sc.nextInt();
		System.out.println("Enter breath: ");
		breath = sc.nextInt();
	}
	
	int area()
	{
		return (length*breath);
	}
	
	int perimeter()
	{
		return ((2*length)+(2*breath));
	}
}
