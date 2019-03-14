package Day8;

public class StringComparison {

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		
		String s3 = new String("Hello");
	
		System.out.println(s1.equals(s3));
		//Does not matter if the string are created in different ways (Literal & new Keywords)
		System.out.println(s1==s3);
		//It matter if the string are created in different ways (Literal & new Keywords)
		System.out.println(s1.equalsIgnoreCase(s3));
		//Ignore Case check letters only
	}

}
