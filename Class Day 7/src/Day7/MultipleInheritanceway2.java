package Day7;

interface showable1
{
	void show();
}

interface printable1 extends showable1
{
	void print();
}


public class MultipleInheritanceway2 implements printable1 {

	public void show()
	{
		System.out.println("Showable method called....!");
	}
	
	public void print()
	{
		System.out.println("Printable method called....!");
	}
}
