package Day7;

import java.util.Scanner;

public class circle extends Diameter implements Area, Circumference{

	float radius;
	final float pi = 3.14f;
	float area;
	float circum;
	float diameter;
	Scanner sc = new Scanner(System.in);
	
	circle()
	{
		System.out.println("Enter the Radius: ");
		radius = sc.nextFloat();
	}
	
	@Override
	public float area()
	{
		area = pi*radius*radius;
		return area;
	}
	
	@Override
	public float circumference()
	{
		circum = 2*pi*radius;
		return circum;
	}
	
	@Override
	public void dia() 
	{
		diameter = 2*radius;
		//return diameter;
	}
	
	public void display()
	{
		System.out.println("Area: "+this.area);
		System.out.println("Circumference: "+this.circum);
		System.out.println("Diameter: "+this.diameter);
	}

}
