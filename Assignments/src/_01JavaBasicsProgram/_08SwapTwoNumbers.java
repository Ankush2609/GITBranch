package _01JavaBasicsProgram;

public class _08SwapTwoNumbers {

	public static void main(String[] args) {
	 int no1 = 110;
	 int no2;
	 int no3 = 220;
	 
	 System.out.println("Before Swap: "+"\n"+
			 			"Number 1: "+no1+"\n"+
			 			"Number 2: "+no3);
	 
	 no2=no1;
	 no1=no3;
	 no3=no2;
	 
	 System.out.println("After Swap: "+"\n"+
	 			"Number 1: "+no1+"\n"+
	 			"Number 2: "+no3);

	}

}
