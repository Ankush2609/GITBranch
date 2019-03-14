import java.text.DecimalFormat;

public class DataType {

	public static void main(String[] args) {
		
		DecimalFormat df2 = new DecimalFormat(".##");
		
		double d1=10.56;
		double d2=566.76;

		System.out.println(d1+d2);
		
		System.out.println("double : " + df2.format((d1+d2)));
	}
}
