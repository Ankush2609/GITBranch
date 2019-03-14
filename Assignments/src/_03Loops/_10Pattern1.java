package _03Loops;

public class _10Pattern1 {

	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=3;i++)
		{
			ch ='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++ ;

			}
			System.out.println();

		}

	}

}
