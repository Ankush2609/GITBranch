package Abstraction;

import java.util.Scanner;

public class Circle extends Shape
{
	float radius=0;
	float area;
	float circumference;
	final float pi = 3.14f;
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the radius: ");
		radius = sc.nextFloat();
	}
	@Override
	void area() 
	{
		this.input();
		area = pi*radius*radius;
		System.out.println("Area: "+area);
	}

	@Override
	void circumference() 
	{
		this.input();
		circumference = 2*pi*radius;
		System.out.println("Circumference: "+circumference);
	}
}