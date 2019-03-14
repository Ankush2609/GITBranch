package Day8;

public class IndexLastIndexExample 
{
	public static void main(String[] args) 
	{
		//01
		System.out.println("01. *******");
		String s1 = "Java is a Programming language.";
		String s2 = new String("Java is a Programming language.");
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.compareTo(s2));
		
		//02
		System.out.println("02. ******");
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 27));
		
		//03
		System.out.println("03. ******");
		String str1[] = s1.split(" ");
		
		for(String s: str1)
		{
			System.out.println(s);
		}
		
		//04
		System.out.println("04. ******");
		String str2[] = s2.split(" ",4);
		for(String s: str2)
		{
			System.out.println(s);
		}
		
		//05
		System.out.println("05. ******");
		System.out.println(s1.length());
		
		//06
		System.out.println("06. ******");
		System.out.println(s1.toUpperCase());
		
		//07
		System.out.println("07. ******");
		System.out.println(s1.toLowerCase());
		
		//08
		System.out.println("08. ******");
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.startsWith("P"));
		
		//09
		System.out.println("09. ******");
		System.out.println(s1.endsWith("."));
		System.out.println(s1.endsWith(" "));
		
		//10
		System.out.println("10. ******");
		System.out.println(s1.replaceFirst("Java", "Python"));
		System.out.println(s1);
		
	}
}
