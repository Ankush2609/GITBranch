package Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(101);
		hs.add(201);
		hs.add(201);
		//System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(2001);
		lhs.add(3001);
		lhs.add(3001);
		lhs.add(4001);
		//System.out.println(lhs);
		lhs.add(90000);
		//System.out.println(lhs);
		
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(2001);
		tr.add(5001);
		tr.add(3001);
		tr.add(4001);
		//System.out.println(tr);
		
		//tr.addAll(hs);
		//System.out.println(tr);
		hs.addAll(tr);
		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}