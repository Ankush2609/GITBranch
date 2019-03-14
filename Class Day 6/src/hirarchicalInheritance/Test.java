package hirarchicalInheritance;

public class Test {

	public static void main(String[] args) {

		int sal;
		
		//For Employee
		Employee em = new Employee(10001, "Yogesh", 7000);
		sal = em.SalaryCalc(2000);
		System.out.println("Salary of Employee: "+sal);
		System.out.println("*******************************");
		//For Manager
		Manager m = new Manager(10002,"Ankush", 10000, 5);
		sal = m.SalaryCalc(5000);
		System.out.println("Salary of Manager: "+sal);
		System.out.println("*******************************");
		//For HR 
		HR h = new HR(10003,"Ram", 50000, 5);
		sal = h.SalaryCalc(5);
		System.out.println("Salary of HR: "+sal);
		System.out.println("*******************************");
	}
}
