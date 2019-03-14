package Day8;

public class StringBuilderExample
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Java is a programming language");
		
		System.out.println(sb.append(" along with Python."));
		System.out.println(sb.insert(5, "and Python "));
		System.out.println(sb.delete(0, 9));
		System.out.println(sb.deleteCharAt(50));
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb.length());
	}
}