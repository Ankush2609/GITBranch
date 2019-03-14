package Day8;

import java.util.Scanner;

public class RollerCoasterException 
{
	int temp;
	
	void validate(int age) throws AgeException
	{
		if(age < 12)
		{
			temp = 12- age;
			throw new AgeException(" You should come after "+temp);
		}
		else if(age> 65)
		{
			temp = age - 65;
			throw new AgeException("You should come before "+  temp);
		}
		else
		{
			System.out.println("Enjoy the ride..!!!");
			//throw new AgeException("Enjoy the ride..!!!");
		}
	}
	public static void main(String[] args) 
	{
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		input = sc.nextInt();
		RollerCoasterException r = new RollerCoasterException();
		try 
		{
			r.validate(input);
		} 
		catch (AgeException e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}
}
