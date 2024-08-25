package practice_new;

public class Factors_3 {

	public static void main(String[] args) {

		int start = 1; 
		int end = 50;
		
		for(int i=start; i<=end; i++)
		{
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++;
					if(count > 3)
					{
						break;
					}
				}
			}
			if(count == 3)
			{
				System.out.print(i + " ");				
			}
		}

	}

}
