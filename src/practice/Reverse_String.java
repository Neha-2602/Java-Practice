package practice;

public class Reverse_String {

	public static void main(String[] args) {

		String name = "Neha Gupta";
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());

		
		char ch[] = name.toCharArray();
		String rev= "";
		
		for(int i=ch.length-1; i>=0; i--) 
		{
			rev+=ch[i];			
		}
		System.out.println(rev);
	}

}
