package patterns;

public class Hollow_Box {

	public static void main(String[] args) {

		int n = 5;
		
		for(int i=1; i<= n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n || j==1 || i==1 || j==n)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}