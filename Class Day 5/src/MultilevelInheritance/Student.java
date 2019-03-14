package MultilevelInheritance;

import java.util.Scanner;

public class Student {
	
	String name;
	int rollno;
	
	Scanner sc = new Scanner(System.in);
	//#01
/*	void inputdata(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}*/
	
	//#02
	void input()
	{
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Roll No.: ");
		rollno = sc.nextInt();
	}
}
