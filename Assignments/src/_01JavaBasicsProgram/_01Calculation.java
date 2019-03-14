package _01JavaBasicsProgram;

public class _01Calculation {

	public static void main(String[] args) {
		int no1=10;
		int no2=20;
		
		int sum;
		int subtract;
		int multiplication;
		float division;
		int reminder;
		
		sum = no1+no2;
		subtract = no1-no2;
		multiplication=no1*no2;
		division=(float)no1/no2;
		reminder=no1%no2;
		
		System.out.println("Sum= "+sum);
		System.out.println("subtract= "+subtract);
		System.out.println("multiplication= "+multiplication);
		System.out.println("division= "+division);
		System.out.println("reminder= "+reminder);
	}

}
