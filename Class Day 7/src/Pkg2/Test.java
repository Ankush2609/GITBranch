package Pkg2;

import Pkg1.First;

//public class Test extends First 
//private+protected in case of class: Illegal modifier for the class Test; only public, abstract & final are permitted
public class Test
{

	public static void main(String[] args) 
	{
		First f = new First();
		//Test f = new Test();
		f.input();
		f.display();
	}

}
