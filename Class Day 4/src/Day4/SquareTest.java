package Day4;

public class SquareTest {

	public static void main(String[] args) {
		
		Square sq = new Square(); 
		Square sr  = new Square();
		
		//#1
		int sw  = sq.square();
		System.out.println("Square: "+sw);
		
		//#2
		System.out.println("Square: "+sr.square());		
	}
}
