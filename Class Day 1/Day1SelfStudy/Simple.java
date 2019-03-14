package Day1SelfStudy;

class Simple{  
	public static void main(String[] args){  
	
	float f=10.5f;  
	
	//int a=f;//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//Type mismatch: cannot convert from float to int 
		
	int a=(int)f;  				//Explicit type casting
	System.out.println(f);  
	System.out.println(a); 
	
	int i = 10;
	double d = i;
	System.out.println(d); 		//Implicit type casting
}}  
