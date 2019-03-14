package hirarchicalInheritance;

public class HR extends Employee
{
	int noOfRct;
	
	HR(int empid, String name, int salary,int noOfRct) 
	{
		super(empid, name, salary);
		this.noOfRct = noOfRct;
	}

	int SalaryCalc(int noOfRct)
	{
		super.display();
		salary = salary+(noOfRct*45000);
		return salary;
	}
	
}
