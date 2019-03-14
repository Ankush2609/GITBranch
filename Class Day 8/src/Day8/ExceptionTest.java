package Day8;

public class ExceptionTest 
{

	public static void main(String[] args) 
	{
		try 
		{
			//#01
			int div = 2/0;
			System.out.println(div);
			
			//#02
			int arr[] = new int[5];
			arr[7]=30;
			
		}
		
		//01
/*		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}*/
		
		//02
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("finally...!!!");
		}
	}

}

