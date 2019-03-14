package Day1SelfStudy;

public class ClassLoaderExample {

	public static void main(String[] args) {
		//Warning for the below line: 
		//class is a raw type. references to generic type class <T> should be parameterized.
		//Class c = ClassLoaderExample.class; 
		//Can be solved by:
		Class<?> c = ClassLoaderExample.class;
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		System.out.println(c.getModifiers());
		System.out.println(c.getPackage());
		System.out.println(c.getMethods());
		System.out.println(c.getInterfaces());
		System.out.println(c.getClassLoader());
	}
}