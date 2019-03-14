package Day5;

public class OverloadDemosTest {

	public static void main(String[] args) {
		OverloadDemos os = new OverloadDemos();
		
		os.add(10,20);
		os.add(10, 20, 30);
		
		System.out.println("Addition: "+os.add(10.6f, 20.2f));
		System.out.println("Addition: "+os.add("Good ", "Morning"));
	
	}

}
