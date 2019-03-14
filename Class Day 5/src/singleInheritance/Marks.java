package singleInheritance;

import java.util.Scanner;

public class Marks extends Student{
	
	int marks;
	
	Scanner sc = new Scanner(System.in);
	

	
	//#01
/*	void inputdata(int marks)
	{
		this.marks = marks;
	}
	void display()
	{
		System.out.println("Student Details: ");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll No."+rollno);
		System.out.println("Student marks: "+marks);
	}*/
	
	//#02
	void inputmark()
	{
		System.out.println("Enter Marks: ");
		marks = sc.nextInt();
	}
	
	void displaydetail()
	{
		System.out.println("Student Details: ");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll No."+rollno);
		System.out.println("Student marks: "+marks);
	}
}
