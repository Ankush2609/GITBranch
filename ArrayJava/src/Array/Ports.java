package Array;

import java.util.Scanner;

public class Ports 
{
	public static void main(String[] args) 
	{ 
		//To Get the Port No.
	     System.out.print("Enter number of ports :");
		 Scanner s = new Scanner(System.in);
	     int ports = s.nextInt();
	     
		//To Get the port details.
	     for(int i=0;i<ports;i++) 
	     {
		     Scanner rdata = new Scanner(System.in);
		     String rawdata = rdata.next();
		     String[] words = rawdata.split("\\|");
		     int j = words.length;
	     }
		  

    	 String[][] arr = new String[ports][j];
    	 
	    	 for(int k=0;k<5;k++)
	    	 {
	    		 arr [i][k] = words[i];
	    		 System.out.print(arr [i][k]);
	    	 }
	 }
}

