package Day5;

import java.util.Scanner;

public class Employee {
	
	String name;
	int empid;
	int sal;
	
	Scanner sc = new Scanner(System.in);
	
	//#01
	/*Employee()
	{
		System.out.println("Enter Employee Name: ");
		name = sc.next();
		System.out.println("Enter Employee No.: ");
		empid = sc.nextInt();
		System.out.println("Enter Salary: ");
		sal = sc.nextInt();
	}*/

	//#02
	Employee(String name,int empid,int sal)
	{
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}
	
	void display()
	{
		System.out.println("Employee Details: ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Salary: "+sal);
	}
}
