package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class StudentTest {

	public static void main(String[] args) 
	{
		Student s1 = new Student(301, "ABV", 90);
		Student s2 = new Student(201, "DFG", 80);
		Student s3 = new Student(101, "KFG", 70);
		
		System.out.println(s1 +"\n"+ s2+"\n"+ s3);
		
		//Create an Array List of type student
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		
		//Print using ListIterator in forward and backward direction
		
		ListIterator<Student> itr = al.listIterator();
		
		System.out.println("Forward Direction: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Backward Direction: ");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
