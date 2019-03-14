package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(200);
		al1.add(200);
		
		System.out.println(al1);
		
		al1.add(0, 300);
		
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(101);
		al2.add(201);
		al2.add(201);		
		al2.add(301);
		System.out.println(al2);
		
		al1.addAll(al2);
		
		System.out.println(al1);
		
		al2.addAll(al1);
		
		System.out.println(al2);
		
		al1.addAll(al1);
		
		System.out.println(al1);
		
		al1.remove(0);
		
		System.out.println(al1);
		
		System.out.println("To search an element in ArryList: "+al1.get(2));
		System.out.println("Size of array list: "+al1.size());
		Collections.sort(al1);
		System.out.println("In Sorted Oder: "+al1);
		
		al1.remove(5);
		System.out.println(al1);
		
		al1.removeAll(al1);
		
		System.out.println(al1);

	}

}
