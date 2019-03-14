package DynamicDisplatch;

public class Test {

	public static void main(String[] args) 
	{
		String a= "Abc";
		Fruit f = new Apple();
		f.eat(a);
		
		Fruit fa = new Fruit();
		fa.eat(a);

	}

}
