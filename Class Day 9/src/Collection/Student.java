package Collection;

public class Student implements Comparable<Student>
{
		int rollno;
		String name;
		int marks;
		
		public Student(int rollno, String name, int marks)
		{
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}
		
		public String toString()
		{
			return name + " "+rollno +" "+marks;
		}

		@Override
		//Student S refers to all S1, S2, S3
		// this.rollno refer current class 
		
		public int compareTo(Student s) 
		{
			if(this.rollno > s.rollno)
			{
				return 1;
			}
			else if(this.rollno < s.rollno)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}

}
