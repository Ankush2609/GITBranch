import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

	public static void main(String[] args) {
		double d = 123456.789; 
    
	    Locale geek1 = new Locale("German", "de");  
        System.out.println("Locale name : " + geek1); 
	    
        NumberFormat nf = NumberFormat.getInstance(geek1); 
	    System.out.println("US representation of " + d + " : "+ nf.format(d)); 
	}
}
