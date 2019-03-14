package HirarchicalInheritance;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	
	Scanner sc = new  Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
	}

}
