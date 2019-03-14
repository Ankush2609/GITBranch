package Day8;

public class Student 
{
	void Validate(int marks) throws MarksOutOfBound
	{
		if(marks> 100)
		{
			throw new MarksOutOfBound("Invalid Marks");
			
		}
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		try
		{
			s.Validate(200);
		}
		catch(MarksOutOfBound e)
		{
			e.printStackTrace();
		}
	}
}
