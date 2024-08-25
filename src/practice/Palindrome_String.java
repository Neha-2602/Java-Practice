package practice;

public class Palindrome_String {

	public static void main(String[] args) {

		String s = "NEHA";
		int left = 0;
		int right = s.length()-1;
		boolean flag = true;
		
		while(left<right)
		{
			if(s.charAt(left) != s.charAt(right))
			{
				flag = false;
			}
			 
			left++;
			right--;
		}
		
		if(flag == true)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
