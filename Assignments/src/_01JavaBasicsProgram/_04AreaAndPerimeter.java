package _01JavaBasicsProgram;

public class _04AreaAndPerimeter {

	public static void main(String[] args) {
		float length=10;
		float width=10;
		float pi=3.14f;
		float radius=10.0f;
		float AC,PC,AR,PR;
		
		AC = (float)pi*radius*radius;
		PC = 2*pi*radius;
		AR = width*length;
		PR = (2*width)+(2*length);
		
		System.out.println("Area of Cirle: "+AC);
		System.out.println("Perimeter of Cirle: "+PC);
		
		System.out.println("Area of Rectangle: "+AR);
		System.out.println("Perimeter of Rectangle: "+PR);
	}

}
