package _01JavaBasicsProgram;

public class _07TimeConversion {

	public static void main(String[] args) {
		
		int sec=86399;
		
		int hour;
		int minute;
		int second;
		
		hour = sec/3600;
		minute = (sec%3600)/60;
		second = ((sec%3600)%60)%60;
		
		System.out.println("Hour: "+hour);
		System.out.println("Minute: "+minute);
		System.out.println("Second: "+second);
	}
}
