
	class Animal{
		String color = "White";
	}
	
	class Dog extends Animal{
		
		String color = "Black";
		void print()
		{
			System.out.println("Color: "+this.color);
			System.out.println("Color: "+super.color);
		}
	}
