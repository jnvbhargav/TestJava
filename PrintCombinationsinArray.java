package javaProblemSolving;

public class PrintCombinationsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] arr = {1,2,3,4};
	
	//	printAllSubArrays(arr,arr.length);
		
		//Current Index ci
		//Sub Sequence Array ss
		//Current index in sub Sequence cssi
		int ci=0;
		int length = arr.length;
		int[] ssa = new int[length];
		int cssi=0;
		
		printAllSubSequences(arr,length,ci,ssa,cssi);
		
	}
	
	public static void printAllSubSequences(int[] arr, int length,int ci, int[] ssa, int cssi)
	{
		//Recursion exit criteria
		if(ci >= length) {
			printSSArray(ssa,cssi);
			return;
		}
		
		printAllSubSequences(arr,length,ci+1,ssa,cssi);
		ssa[cssi]= arr[ci];
		printAllSubSequences(arr,length,ci+1,ssa,cssi+1);
	}
	
	public static void printSSArray(int[] ssa, int cssi)
	{
		System.out.print( "{");

		for(int i = 0; i<cssi; i++)
		{
			System.out.print(ssa[i]+ " ");
		}
		System.out.println( "}");
	}
	
	public static void printAllSubArrays(int[] arr,int n)
	{
		int index;
		for(index=0; index<arr.length; index++)
		{
			for(int j=index;j<(arr.length); j++)
			{
				printArray(arr,index,j);
			}
			
		}
	}
	
	public static void printArray(int[] arr, int index, int j)
	{
		System.out.print( "{");

		for(int i = index; i<=j; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println( "}");

	}

}
