package javaProblemSolving;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-1,-2,32,-6,9,3,-60};

		System.out.println(FindMaxSumofSubArray(arr));
		
		FindMaxSumofSubArrayMethod2(arr);
		
		FindMaxSumofSubArrayMethod3(arr);
	}
	
	public static int FindMaxSumofSubArray(int[] arr)
	{
		
		// Choose the Sub Array Size 1,2 ---
		
		//TRaverse through all the elements
		
		//calculate the sum of each Sub Array 
		
		// Swap it with the Ans value
		
		int length = arr.length;
		int ans = Integer.MIN_VALUE;
		
		for (int Sub_Array_Size=1;Sub_Array_Size< length; Sub_Array_Size++)
		{
			for (int index=0; index < length; index++ )
			{
				if(index + Sub_Array_Size > length)
					break;
				int sum=0;
				System.out.print("{");
				for(int i=index; i<index+Sub_Array_Size; i++)
				{
					sum = sum + arr[i];
					System.out.print(arr[i]);
					ans = Math.max(ans, sum);
				}
				System.out.println("}");

			}
		}
		return ans;
	}
	
	
	public static void FindMaxSumofSubArrayMethod2(int[] arr)
	{
		
		int length = arr.length;
		int ans = Integer.MIN_VALUE;

		for(int index =0; index<length ; index++)
		{
			int sum =0;
			for (int Array_size=1; Array_size<= length; Array_size++)
			{
				if(Array_size+index >length)
				{
					break;
				}
				sum = sum + arr[Array_size+index-1];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println("Here is the Max Sum of Sub Array " + ans);

	} 

	
	public static void FindMaxSumofSubArrayMethod3(int[] arr)
	{
		int ans= 0, sum=0;
		
		int length = arr.length;
		
		for (int i=0; i<length ; i++)
		{
			if(sum + arr[i]>0)
				sum = sum + arr[i];
			else
				sum =0;
			
			ans= Math.max(ans, sum); 
 		}
		System.out.println("Here is the Max Sum of Sub Array " + ans);
	}
	
	
	
	
}
