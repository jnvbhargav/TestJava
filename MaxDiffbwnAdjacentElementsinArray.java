package javaProblemSolving;

public class MaxDiffbwnAdjacentElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maximum Difference between any adjacent index in an array 
		
		int[] arr = {2,23,42,331,22,10};
		int diff,maxdiff=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			diff = arr[i+1]- arr[i];
			if(diff > maxdiff)
			{
				maxdiff = diff;
			}
		}
		
		System.out.println("Maximum difference between Adjacent values in Array is : " + maxdiff);

	}

}
