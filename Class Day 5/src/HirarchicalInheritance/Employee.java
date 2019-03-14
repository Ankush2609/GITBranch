package HirarchicalInheritance;

import java.util.Scanner;

public class Employee extends Person{
	int empid;
	int sal;
	Scanner sc = new  Scanner(System.in);
	void input_emp()
	{
		System.out.println("Enter Emp Id: ");
		empid = sc.nextInt();
		System.out.println("Enter Salary: ");
		sal = sc.nextInt();
	}
	
	void show_EmpDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Salary: "+ sal);
	}

}
