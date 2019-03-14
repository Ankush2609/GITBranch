package Day4;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		Employee em3 = new Employee();
		
		em1.input(101, "Ankush", 80000);
		em2.input(102, "Yogesh", 40000);
		em3.input(103, "Ram", 30000);
		
		System.out.println("Employee 1 details: ");
		em1.display();
		System.out.println("Employee 2 details: ");
		em2.display();
		System.out.println("Employee 3 details: ");
		em3.display();
		
		if(em1.sal >em2.sal && em1.sal > em3.sal)
		{
			System.out.println(em1.name+" has highest salary of "+em1.sal);
		}
		else if(em2.sal > em1.sal && em2.sal > em3.sal)
		{
			System.out.println(em2.name+" has highest salary of "+em2.sal);
		}
		else
		{
			System.out.println(em3.name+" has highest salary of "+em3.sal);
		}
	}

}
