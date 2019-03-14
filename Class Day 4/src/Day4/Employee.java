package Day4;

public class Employee {
	
	int empid;
	String name;
	int sal;
	
	void input(int empid,String name,int sal)
	{
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	
	void display()
	{
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+sal);
		System.out.println();
	}
}
