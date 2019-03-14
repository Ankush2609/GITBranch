package Day7;

public class Employee 
{
	private int empid;
	private String name;
	
	public void setEmployeeId(int empid)
	{
		if(empid> 100)
		{
			this.empid = empid;
		}
		else
		{
			this.empid = 0;
		}
		
	}
	
	public int getEmployeeId()
	{
		return empid;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
