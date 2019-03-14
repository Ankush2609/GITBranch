package Day10;

//public class Emp 
/*Exception in thread "main" java.lang.ClassCastException: Day10.Emp cannot be cast to java.base/java.lang.Comparable
at java.base/java.util.TreeMap.compare(Unknown Source)
at java.base/java.util.TreeMap.put(Unknown Source)
at java.base/java.util.TreeSet.add(Unknown Source)
at Day10.EmpTest.main(EmpTest.java:17)*/
public class Emp implements Comparable<Emp>
{

	int empid;
	String name;
	int salary;
	
	public Emp(int empid, String name, int salary) 
	{
		this.empid = empid;
		this.name =  name;
		this.salary = salary;
	}
	
	//Its should be Exactly Same
	
	public String toString()
	{
		return name+" "+empid+" "+salary;	
	}

	@Override
	public int compareTo(Emp e) 
	{

		if(this.salary > e.salary)
		{
			return 1;
		}
		else if(this.salary < e.salary)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	
	}
}