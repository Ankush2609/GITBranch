package Day5;

public class Student {
	
	int rollno;
	String name;
	
	Student()
	{
		System.out.println("Student Details: ");
	}
	
	Student(String name,int Rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll No.: "+rollno);
	}
}
