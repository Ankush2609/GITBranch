package HirarchicalInheritance;

import java.util.Scanner;

public class Student extends Person{
	int rollno;
	int marks;
	
	Scanner sc = new  Scanner(System.in);
	
	void input_Student()
	{
		System.out.println("Enter Student Roll No.: ");
		rollno = sc.nextInt();
		System.out.println("Enter Student Marks: ");
		marks = sc.nextInt();
	}
	
	void showStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Roll No. "+rollno);
		System.out.println("Student marks: "+marks);
	}

}
