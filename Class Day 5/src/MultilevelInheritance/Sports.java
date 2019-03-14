package MultilevelInheritance;

import java.util.Scanner;

public class Sports extends Marks{
	int score;
	
	Scanner sc = new Scanner(System.in);
	
	void inputScore()
	{
		System.out.println("Enter Score: ");
		score = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Student Details: ");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll No."+rollno);
		System.out.println("Student marks: "+marks);
		System.out.println("Student Score: "+score);
	}

}
