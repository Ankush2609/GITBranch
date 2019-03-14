package Day7;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.setName("Ankush");
		e.setEmployeeId(900);

		System.out.println("Name: "+e.getName());
		System.out.println("Emp Id: "+e.getEmployeeId());

	}

}
