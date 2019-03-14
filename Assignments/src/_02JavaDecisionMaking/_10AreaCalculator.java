package _02JavaDecisionMaking;

import java.util.Scanner;

public class _10AreaCalculator {
	
	public static void main(String[] args) {
		int choice;
		float pi = 3.14f;
		float area=0f;
		float radius;
		float base;
		float height;
		float length;
		float breadth;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your choice: "+"\n"+
							"1: Rectangle"+"\n"+
							"2: Triangle"+"\n"+
							"3: Circle");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter length: ");
			length = sc.nextFloat();
			System.out.println("Enter breadth: ");
			breadth = sc.nextFloat();
			area = length*breadth;
			System.out.println("Area of circle: "+area);
		}
		break;
		
		case 2:
		{
			System.out.println("Enter base: ");
			base = sc.nextFloat();
			System.out.println("Enter base: ");
			height = sc.nextFloat();
			area = (float) (0.5*base*height);
			System.out.println("Area of circle: "+area);
		}
		break;
		
		case 3:
		{
			System.out.println("Enter radius: ");
			radius = sc.nextFloat();
			area = (float)(pi*radius*radius);
			System.out.println("Area of circle: "+area);
		}
		break;
		
		default:
		{
			System.out.println("Check Input");
		}
		}
		
		sc.close();
	}
}
