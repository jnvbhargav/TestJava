package javaProblemSolving;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4};
		
		int length=2;
		PrintSubSequences(arr,length);
		
	}

	public static void PrintSubSequences(int[] arr,int length)
	{
		for(int i=0; i<length; i++)
		{
			for(int j=i; j<length; j++)
			{
				System.out.print("{");
				for(int k=i; k<=j; k++)
				{
					System.out.print(arr[k]);
					
				}
				System.out.println("}");

			}
		}
	}

}
