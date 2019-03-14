package Day5;

public class Trainee {

	int empid;
	String name;
	static String OrgName = "TCS";
	
	Trainee(int empid,String name)
	{
		this.empid = empid;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Employee id: "+empid+"\n"+"Employee Name: "+name+"\n"+"Company Name: "+OrgName);
	}
	
	static void change()
	{
		OrgName = "CTS";
	}
}
