package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n0 = 0;
		int n1 = 1;
		int n2;
		System.out.println("Enter the limit : ");
		int limit = sc.nextInt();
		
		System.out.print(n0 + " " + n1);
		
		for(int i=3; i<=limit; i++)
		{
			n2 = n0 + n1;
			System.out.print(" "+n2);
			n0 = n1;
			n1 = n2;		
		}
	}
}
