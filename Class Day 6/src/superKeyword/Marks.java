package superKeyword;
//Error: Implicit super constructor Student() is undefined for default constructor. Must define an explicit constructor

public class Marks extends Student{

	float marks;
	
	Marks(int rollno, String name,float marks) {
		super(rollno, name); //To derive parent class constructor
		this.marks = marks;
	}

}