package array;

public class Min_Max {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int min = arr[0];
		int max = arr[0];
		int size = arr.length-1;
		
		for(int i=0; i<size; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else
				min = arr[i];
		}
		
		System.out.println("Minimum : " +min);
		System.out.println("Maximum : " +max);
	}

}
