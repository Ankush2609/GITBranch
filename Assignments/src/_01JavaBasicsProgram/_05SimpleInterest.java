package _01JavaBasicsProgram;

public class _05SimpleInterest {

	public static void main(String[] args) {
		int Pricnipal=10000;
		float Rate=9.62f;
		int term=15;
		Float SI;
		
		SI = (float)(Pricnipal*Rate*term)/100;
		System.out.println("Simple Interest: "+SI);
	}

}
