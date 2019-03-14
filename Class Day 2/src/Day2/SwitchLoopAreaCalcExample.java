package Day2;

import java.util.Scanner;

public class SwitchLoopAreaCalcExample {

	public static void main(String[] args) {
	
		int choice;
		int length;
		int breath;
		int area;
		int side;
		int base;
		int height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****Area Calculator****");
		System.out.println("1. Area of Rectangle"+"\n"+
						   "2. Area of Square"+"\n"+
						   "3. Area of Triangle");
		
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{		
			System.out.println("Enter the length");
			length = sc.nextInt();
			
			System.out.println("Enter the breath");
			breath = sc.nextInt();
			
			area = length*breath;
			
			System.out.println("Area of rectangle :"+area);
		}
		break;
		
		case 2:
		{	
			System.out.println("Enter the side");
			side = sc.nextInt();
			
			area = side*side;
			
			System.out.println("Area of square :"+area);
		}
		break;
		
		case 3:
		{	
			System.out.println("Enter the base");
			base = sc.nextInt();
			
			System.out.println("Enter the height");
			height = sc.nextInt();
			
			area = base*height;
			
			System.out.println("Area of circle :"+area);
		}
		break;
		
		default:
		{
			System.out.println("Invalid choice");
		}
		
		}
		sc.close();
	}

}
