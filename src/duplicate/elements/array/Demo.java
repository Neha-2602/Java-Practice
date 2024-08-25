package duplicate.elements.array;

public class Demo {

	public static void main(String[] args) {
		int arr[] = {2,2,5,5,7,9,9};
		int new_arr[] = new int[arr.length];
		
		new_arr[0] = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] != arr[i-1])
			{
				new_arr[i] = arr[i];
			}
			else
			{
				continue;
			}
		}
		
		for(int i=0; i<=new_arr.length-1; i++)
		{
			if(new_arr[i] == 0)
			{
				continue;
			}
			else
				System.out.println(new_arr[i]);
		}
	}
}



