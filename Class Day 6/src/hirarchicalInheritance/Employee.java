package hirarchicalInheritance;

import java.util.Scanner;

public class Employee 
{
	int empid;
	String name;
	int salary;
	int allowance;
	Scanner sc = new Scanner(System.in);
	
	Employee(int empid,	String name,int salary)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Emp Id: "+empid);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Base Salary: "+salary);
	}
	
	int SalaryCalc(int allowance)
	{
		this.display();
		salary = salary+allowance;
		return salary;
	}
}
