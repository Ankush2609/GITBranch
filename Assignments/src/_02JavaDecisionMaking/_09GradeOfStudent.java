package _02JavaDecisionMaking;

import java.util.Scanner;

public class _09GradeOfStudent {

	public static void main(String[] args) {
		int marks;
		String grade = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student marks: ");
		marks = sc.nextInt();
		
		if(marks>=0 && marks<=50)
		{
			grade = "Failed";
		}
		else if(marks>50 && marks<=75)
		{
			grade = "First";
		}
		else if(marks>75 && marks<=100) {
			grade = "Distinction";
		}
		
		switch(grade)
		{
		case "Failed":
		{
			System.out.println("Student Grade: "+grade);
		}
		break;
		
		case "First":
		{
			System.out.println("Student Grade: "+grade);
		}
		break;
		
		case "Distinction":
		{
			System.out.println("Student Grade: "+grade);
		}
		break;
		
		default:
		{
			System.out.println("Check Input");
		}
		}
		sc.close();
	}

}
