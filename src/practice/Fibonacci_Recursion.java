package practice;

public class Fibonacci_Recursion {
	
	static int n0=0, n1=1, n2=0;
	
	static public void fib(int count)
	{
		if(count>0)
		{
			n2 = n0+n1;
			n0 = n1;
			n1 = n2;
			System.out.print(" " + n2);
			fib(count - 1);			
		}
	}
	
	public static void main(String[] args) {

		int count = 8;
		System.out.print(n0 + " " + n1);
		fib(count-2);

	}

}
