package Day5;

public class OverloadDemos {

	void add(int a, int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Additon: "+(a+b+c));
	}
	
	float add(float a, float b)
	{
		return a+b;
	}
	
	String add(String a, String b)
	{
		return a+b;
	}
}
