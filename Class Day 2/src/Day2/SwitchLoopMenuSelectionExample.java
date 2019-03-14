package Day2;

import java.util.Scanner;

public class SwitchLoopMenuSelectionExample {

	public static void main(String[] args) {
		
		String stream;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****12th Options*****");
		System.out.println("Science"+"\n"+"Commerce"+"\n"+"Art");
		
		System.out.println("Enter your 12th stream");
		stream = sc.next();
		
		switch(stream)
		{
		case "Science":
			System.out.println("You can opt Engg. OR Medical");
			break;
			
		case "Commerce":	
			System.out.println("You can opt. CA");
			break;
			
		case "Art":
			System.out.println("You can opt. Art");
			break;
			
		default:
			System.out.println("Invalid Stream");
		}
	sc.close();
	}

}
