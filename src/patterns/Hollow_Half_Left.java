package patterns;

public class Hollow_Half_Left {

	public static void main(String[] args) {

		int num =5;
		
		for(int i =1; i<=num; i++)
		{
			for(int j=1 ; j<=i; j++)
			{
				if((i == num) || (j == 1)  || (j == i))
				{					
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
