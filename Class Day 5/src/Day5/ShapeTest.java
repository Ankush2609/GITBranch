package Day5;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		System.out.println("Area of circle : "+s.area(3.14f, 10.0f));
		System.out.println("Area of Rectangle: "+s.area(10, 20));
		System.out.println("Area of Square: "+s.area(20));
	}

}
