package Day10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudentTest {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"ABC", 33400);
		Student s2 = new Student(201,"DEF", 34200);
		Student s3 = new Student(301,"XYZ", 32300);
		
		//Create LinkedList of Type Student
		
		LinkedList<Student> l = new LinkedList<Student>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//Sorting 
		Collections.sort(l);
		System.out.println(l);
		
		//Use List Iterator
/*		ListIterator<Student> ltr = l.listIterator();
		
		//Forward Direction
		System.out.println("Forward Direction: ");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
*/
	}

}
