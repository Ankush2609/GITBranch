package Day5;

import java.util.Scanner;

public class EmployeeTest {
	public static void main (String[] args)
	{
		int size;
		
		//Ask size
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the no of detail you want to user:");
		size = sc.nextInt();
		
		//declare a employee type of array
		//Format int arr[] = new int[size];
		Employee emp[] = new Employee[size];
		
		//#01
/*		for(int i=0;i<size;i++)
		{
			emp[i]= new Employee();
		}*/
		
		//#02
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Employee Name: ");
			String name = sc.next();
			System.out.println("Enter Employee No.: ");
			int empid = sc.nextInt();
			System.out.println("Enter Salary: ");
			int sal = sc.nextInt();
			
			emp[i] = new Employee(name, empid, sal);
		}
		
		//Employee type array
		
		for(Employee e: emp)
		{
			e.display();
		}
		
	}
}
