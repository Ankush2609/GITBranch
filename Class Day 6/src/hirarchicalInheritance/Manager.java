package hirarchicalInheritance;

public class Manager extends Employee
{
	int noOfProj;
	
	Manager(int empid, String name, int salary, int noOfProj) 
	{
		super(empid, name, salary);
		this.noOfProj = noOfProj;
	}
	
	int SalaryCalc(int bonus)
	{
		super.display();
		salary = salary+(noOfProj*bonus);
		return salary;
	}
}
