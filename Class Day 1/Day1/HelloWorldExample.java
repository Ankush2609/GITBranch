package Day1;

public class HelloWorldExample 
{
	public static void main (String [] args)
	{
		// 1.0 Sub program
		System.out.println("Hello World...!!!");
		//System.out.print(); 
		//Unresolved compilation problem: 
		//The method print(boolean) in the type PrintStream is not applicable for the arguments ()
		System.out.println();
		//It works.
		
		//2.0 Sub program
		int num1 = 10;
		int num2 = 20;
		int sum = num1+num2;
		
		System.out.println("Sum of nos. is "+sum);
		
		//3.0 Sub program
		int a=10, b=20;
		int large = (a>b)? a:b;
		
		System.out.println(large);
	}
}
