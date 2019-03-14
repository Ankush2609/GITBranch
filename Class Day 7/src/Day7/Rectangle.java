package Day7;

public class Rectangle 
{
	private int length;
	private int breath;
	int area;
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void setBreath(int breath)
	{
		this.breath = breath;
	}
	
	public int getBreath()
	{
		return breath;
	}
	
	private void Area()
	{
		area =  length*breath;
		System.out.println("Area: "+area);
	}
	
public static void main(String[] args) 
	{
	Rectangle r = new Rectangle();
	r.setLength(10);
	r.setBreath(10);
	System.out.println("length: "+r.getLength());
	System.out.println("Breath: "+r.getBreath());
	r.Area();
	}
}