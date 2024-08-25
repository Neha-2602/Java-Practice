package patterns;

public class Half_Right_Down {

	public static void main(String[] args) {

		int num=5;
		for(int i=num; i>=0; i--)
		{
			for(int j=0; j<=num-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
