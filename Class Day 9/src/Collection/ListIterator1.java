package Collection;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIterator1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		
		ListIterator<Integer> itr = al1.listIterator();
		
		System.out.println("Forward direction: ");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Backward direction: ");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
