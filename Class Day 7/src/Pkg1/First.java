package Pkg1;

import java.util.Scanner;

public class First 
{
	String name;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	//protected void input()
	{
		System.out.println("Enter Pkg 1 Name: ");
		name  = sc.next();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
	}
}
