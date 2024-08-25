package patterns;

public class Half_Left {
	
	public static void main(String[] args)
	{
		int num = 4;
		for(int i=0; i<=num; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	

}
