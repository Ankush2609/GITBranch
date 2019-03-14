package Day8;

public class HelloWorld {

	public static void main(String[] args) 
	{
		String s1 = "Hello ";
		
		s1.concat("World");
		
		System.out.println(s1);
		
		//2 reference needed for concat
		
		String s2 = s1.concat("World");
		
		System.out.println(s2);

	}

}
