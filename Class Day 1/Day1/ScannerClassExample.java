package Day1;

import java.util.Scanner;

public class ScannerClassExample 
{
	public static void main(String[] args) 
	{
		float percentage;
		String grade=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of student: ");
		String name = sc.next();
		System.out.println("Enter the Roll No. of student: ");
		int rollno = sc.nextInt();
		System.out.println("Enter the Age of student: ");
		int age = sc.nextInt();
		System.out.println("Enter the Marks of student Out of 600: ");
		int marks = sc.nextInt();
		//System.out.println("Enter the Grade of student");
		//char grade = sc.next().charAt(0);
		//char grade = sc.next().charAt(1);
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1
		
		//Calculate percentage
		percentage = ((float)marks/600)*100;
		
		//Calculate Grade
		if(percentage<35)
		{
			grade = "Failed";
		}
		else if(percentage>35 && percentage <=45)
		{
			grade = "C";
		}
		else if(percentage>45 && percentage <=60)
		{
			grade = "B";
		}
		else if(percentage>60 && percentage <=75)
		{
			grade = "A";
		}
		else if(percentage>75)
		{
			grade = "Distinction";
		}
		
		System.out.println("\n"+"***System Details***"+"\n"+
		"Student Name: "+ name +"\n"+
		"Stundent Roll No.: "+ rollno +"\n"+
		"Student Age: "+ age +"\n"+
		"Student Marks: "+ marks +"\n"+
		"Student Percentage: "+ percentage +"\n"+
		"Students Grade: "+ grade+"\n" );
		
		sc.close();
	}
}
