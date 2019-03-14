package Day10;

public class Student implements Comparable<Student>
{
	int empid;
	String name;
	int salary;
	
	public Student(int empid, String name, int salary) 
	{
		this.empid = empid;
		this.name =  name;
		this.salary = salary;
	}
	
	//Its should be Exactly Same
	
	public String toString()
	{
		return name+" "+empid+" "+salary;	
	}

	@Override
	public int compareTo(Student s) 
	
	{
		if(this.salary > s.salary)
		{
			return 1;
		}
		else if(this.salary < s.salary)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
