package Day5;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1 = new Trainee(101,"Ankush");
		Trainee t2 = new Trainee(102,"Yogesh");

		//Without creation of object of class - Static method can call without creating object of class.
		Trainee.change();
		
		t1.display();
		t2.display();
	}

}
