package Day5;

public class MainMethodOverload {

	public static void main(String[] args) {
		
		System.out.println("main method called....");
		MainMethodOverload.main(0);
	}
	
	public static void main(int a) {
		
		System.out.println("Overload main method called....");
	}
}
