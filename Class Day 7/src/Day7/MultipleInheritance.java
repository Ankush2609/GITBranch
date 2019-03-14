package Day7;

interface showable{
	void show();
}

interface printable{
	void print();
}
public class MultipleInheritance implements showable,printable{
	public void show()
	{
		System.out.println("Show method called...!");
	}
	
	public void print()
	{
		System.out.println("Print method called...!");
	}
}
