package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(102, "Ankush", 10110);
		Employee e2 = new Employee(103, "Yogesh", 20210);
		Employee e3 = new Employee(101, "Suresh", 10100);
		
		TreeMap<Integer, Employee> tm =  new TreeMap<Integer, Employee>();
		
		tm.put(e1.empid, e1);
		tm.put(e2.empid, e2);
		tm.put(e3.empid, e3);
		
		for(Entry<Integer, Employee> m: tm.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
	}

}