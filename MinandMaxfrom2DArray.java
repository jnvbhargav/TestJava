package javaProblemSolving;

public class MinandMaxfrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{2,5,89},{211,11,22},{1,2,3}};
		
		int max=0,min;
		min = arr[0][0];
				
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
				else if(arr[i][j] < min)
					min =  arr[i][j];
			}
		}
		System.out.println("Max Value " + max + " Min Value " + min);
	}
}
