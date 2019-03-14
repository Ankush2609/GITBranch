package _02JavaDecisionMaking;

import java.util.Scanner;

public class _07Calculator {

	public static void main(String[] args) {
	
	int no1;
	int no2;
	int result;
	
	String condition;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter No. 1: ");
	no1 = sc.nextInt();
	
	System.out.println("Enter No. 2: ");
	no2 = sc.nextInt();
	
	System.out.println("Enter your Choice"+"\n"+
					   "Addition"+"\n"+
					   "Subtraction"+"\n"+
					   "Multiplication"+"\n"+
					   "Division");
	condition = sc.next();
	
	switch(condition)
	{
	case "Addition":
	{
		result = no1+no2;
		System.out.println("Addition Result: "+result);
	}
	break;
	
	case "Subtraction":
	{
		result = no1-no2;
		System.out.println("Subtraction Result: "+result);
	}
	break;
	
	case "Multiplication":
	{
		result = no1*no2;
		System.out.println("Multiplication Result: "+result);
	}
	break;
	
	case "Division":
	{
		result = no1/no2;
		System.out.println("Division Result: "+result);
	}
	break;
	
	default:
	{
		System.out.println("Check Input");
	}
	sc.close();
	}

}
}

