package Day4;

import java.util.Scanner;

public class Student 
{
	String name;
	int rollno;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Roll No.: ");
		rollno = sc.nextInt();
		//sc.close();
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollno);
		System.out.println("*********************");
	}
}