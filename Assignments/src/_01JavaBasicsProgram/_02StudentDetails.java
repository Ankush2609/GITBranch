package _01JavaBasicsProgram;

import java.util.Scanner;

public class _02StudentDetails {

	public static void main(String[] args) {
		int RollNo;
		String Name;
		int Marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		Name = sc.next();
		
		System.out.println("Enter student Roll No.: ");
		RollNo = sc.nextInt();
		
		System.out.println("Enter Student Marks: ");
		Marks = sc.nextInt();
		
		System.out.println("Student Details:"+"\n"+
		"Student Name: "+Name+"\n"+
		"Student Roll No.: "+RollNo+"\n"+
		"Student Marks: "+Marks);
		
		sc.close();
	}

}
