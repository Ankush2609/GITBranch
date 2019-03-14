package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Enter the Name: ");
		String name = br.readLine();
		
		System.out.println("Your name: "+name);
		
		System.out.println("Enter the no: ");
		String num = br.readLine();
		
		int no = Integer.parseInt(num);
		System.out.println("Square: "+(no*no));
		
		br.close();
		
	}

}
