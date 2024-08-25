package practice;

import java.util.Scanner;

public class Prime_Range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		if(range<=1)
		{
			System.out.println("Enter valid range");
		}
		else
		{
			for(int i=2; i<=range; i++)
			{
				boolean flag = true;
				
				for(int j=2; j<i; j++)
				{
					if(i%j == 0)
					{
						flag = false;
					}
				}
				
				if(flag == true)
				{
					System.out.print(i + " ");
				}
			}
		}

	}

}
