package superKeyword;

public class Grade extends Marks{

	char grade;
	
	Grade(int rollno, String name, float marks,char grade) 
	{
		super(rollno, name, marks);
		this.grade = grade;
	}
		void display()
		{
			System.out.println("Name: "+name);
			System.out.println("Roll No.: "+rollno);
			System.out.println("Marks: "+marks);
			System.out.println("Grade: "+grade);
		}
	}