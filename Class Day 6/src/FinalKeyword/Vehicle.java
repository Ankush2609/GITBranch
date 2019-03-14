package FinalKeyword;

final public class Vehicle 
{
	final int speed = 100;
	
	final void change()
	{
		//The final field Vehicle.speed cannot be assigned
		speed =900;
	}
}

class Bike extends Vehicle
{
	//Cannot override the final method from Vehicle
	//On adding final keyword to the class Vehicle: Below error displayed
	//The type Bike cannot subclass the final class Vehicle
	void  change()
	{
		
	}
}
