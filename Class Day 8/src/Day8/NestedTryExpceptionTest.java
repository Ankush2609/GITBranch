package Day8;

public class NestedTryExpceptionTest {

	public static void main(String[] args) {
		
		
		try
		{
			try
			{
				int div = 20/0;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			
			try
			{
				int arr[]=new int[5];
				arr[6] = 10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
		finally 
		{
				System.out.println("finallly...!!!");
		}

	}

}
