package Day7;

public class check {

	public static void main(String[] args) {
		B obj = new B();
		obj.msg();
		obj.print();
		A.display();
	}
}
	interface A
	{
		void msg();
		//Abstract method do not specify the body
		//void print()
		default void print()
		{
			System.out.println("Default method called...!");
		}
		static void display()
		{
			System.out.println("Static method called...!");
		}
	}
	//The type check.B must implement the inherited abstract method check.A.msg()
	class B implements A
	{
		//Multiple markers at this line
		//- implements Day7.check.A.msg
		//- Cannot reduce the visibility of the inherited method from 
		// check.A
		
		public void msg()
		{
			System.out.println("Msg called...!");
		}
		
	}

