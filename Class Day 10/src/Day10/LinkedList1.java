package Day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String [] args)
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		l.add(201); al.add(501);
		l.add(301); al.add(601);
		l.add(401); al.add(701);
		
		System.out.println(l);
		System.out.println(al);
		
/*		l.addFirst(101);
		System.out.println(l);
		
		l.addLast(501);
		System.out.println(l);
		
		System.out.println(l.size());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.getClass());
		System.out.println(l.contains(601));


		l.removeLast();
		System.out.println(l);*/
		
		l.addAll(al);
		System.out.println(l);
		
	}
	
}