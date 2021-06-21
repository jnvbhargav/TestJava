package javaProblemSolving;

public class ReturnSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr  = {1,2,3,4,5};
		int sumofElements = SumArray(arr);
		
		System.out.println(sumofElements);
	}
	
	public static int SumArray(int[] arr)
	{
		int sumofArray=0;
		for(int i:arr)
		{
			sumofArray = sumofArray + i;
		}
		return sumofArray;
	}

}
