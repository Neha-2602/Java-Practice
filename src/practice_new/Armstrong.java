package practice_new;

public class Armstrong {

	public static void main(String[] args) {

		int num = 153;
		int sum =0;
		int count =0;
		int temp = num;
		
		while(temp>0)
		{
			count++;
			temp= temp/10;
		}
		
		temp = num;
		
		while(temp>0)
		{
			int digit = temp%10;
			sum = (int) (sum+ Math.pow(digit, count));
			temp = temp/10;
		}
		
		if(sum == num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}