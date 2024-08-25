package array;

public class Diagonal_Sum {

	public static void main(String[] args) {

		int arr[][] = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		//left diagonal
		int left_sum =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j)
				{
					left_sum+=arr[i][j];
				}
			}
		}
		
		System.out.println("Left Diagonal sum : "+left_sum);
		
		
		//right DIAGONAL
		
		int right_sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i+j == arr.length-1)
				{
					right_sum+=arr[i][j];
				}
			}
		}
		
		System.out.println("Right Diagonal sum : "+right_sum);

	}

}
