package Day10;

import java.util.Iterator;
import java.util.TreeSet;

public class EmpTest {

	public static void main(String[] args) 
	{

		Emp e1 = new Emp(101,"ABC", 33400);
		Emp e2 = new Emp(201,"DEF", 34200);
		Emp e3 = new Emp(301,"XYZ", 32300);

		TreeSet<Emp> t = new TreeSet<Emp>();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		Iterator<Emp> itr = t.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
