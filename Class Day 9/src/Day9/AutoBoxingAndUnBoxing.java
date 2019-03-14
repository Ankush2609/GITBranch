package Day9;

public class AutoBoxingAndUnBoxing 
{

	public static void main(String[] args) 
	{
		float num = 12.5f;
		
		@SuppressWarnings("deprecation")
		Float f = new Float(num);
		
		System.out.println("Converted to wrapper :"+f);
		
		float flo = f.floatValue();
		
		System.out.println("Converted to primitive: "+flo);

	}

}
