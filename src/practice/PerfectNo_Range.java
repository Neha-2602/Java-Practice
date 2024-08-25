package practice;

import java.util.Scanner;

public class PerfectNo_Range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		for(int i=1; i<=range; i++)
		{
			int sum = 0;
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			
			if(sum == i)
			{				
				System.out.print(i + " ");
			}
		}
	}
}
