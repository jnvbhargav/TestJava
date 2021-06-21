package javaProblemSolving;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {3,1,0,2,5};
		int target = 0;
		int[] indeces = new int[2];
		indeces = FindTwoSum(arr, target);
		System.out.println(indeces[0] + " " + indeces[1]);
		
		int[] arr1 = {-3,1,0,2,-5};

		int[] arr2 = {3,-1,0,-2,5};

		boolean is2SumArray =  FindTwoSum2Array(arr1, arr2, target);
		System.out.println("Found the target Sum in the arrays " + is2SumArray);
	}
	
public static int[] FindTwoSum(int[] arr, int target)
	{
		int[] indeces = new int[2];
		HashMap<Integer,Integer> hm = new HashMap<>();
				
		for(int i=0; i<arr.length; i++)
		{
			if(hm.containsKey(target-arr[i]))
			{
				indeces[0] = hm.get(target-arr[i]);
				indeces[1] = i;
				break;
			}
			hm.put(arr[i],i);
		}
		return indeces;
	}


public static boolean FindTwoSum2Array(int[] arr1, int[] arr2, int target)
{
	HashSet<Integer> differenceshs = new HashSet<Integer>();
	
	for(int i=0; i< arr1.length; i++)
	{
		differenceshs.add(target - arr1[i]);
		
	}
	
	for(int j=0; j<arr2.length; j++)
	{
		if(differenceshs.contains(arr2[j]))
			return true;
	}
	return false;
}


}
