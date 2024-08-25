package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		boolean flag = true;
		
		if(num<=1)
		{
			flag = false;
		}
		else
		{		
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag = false;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not prime");

	}

}
