package javaProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate an array with the matching elements from 2 arrays
		//Note: Use ArrayList to store unknown array size of elements 
		
		int[] arr1 = {3,1,4,5,6,7};
		int[] arr2 = {0,2,4,5,6,7};
	//	FindMatchingArray(arr1,arr2);

		SortArray(arr1);
		SortArray(arr2);

	//	Arrays.asList(arr1).stream().forEach(s ->System.out.println(s));
		
	}
	
	public static void SortArray(int[] arr)
	{
		int temp;
		
		int Arralen = arr.length;
		
		System.out.println("\nGiven Array is " );
		for(int k : arr)
			System.out.print(k);
		
		for(int i=0;i<Arralen-1; i++)
		{
			for(int j=i+1; j<Arralen-1; j++)
			{
				if(arr[i] > arr[j])
					//Swap(arr[i],arr[i+1]);
					{
						arr[i]= arr[i] + arr[j] ;
						arr[j]= arr[i] - arr[j] ;
						arr[i]= arr[i] - arr[j] ;	
					}
				}
		}
		
		System.out.println("\nSorted Array is ");
		
		for(int k : arr)
		System.out.print(k);
	}
	
	public static void Swap(int a, int b)
	{
		a = a +b;
		b = a-b;
		a = a-b;
		System.out.println("Here are the numbers a: " + a + " And B : " + b);
	}
	public static void FindMatchingArray(int[] arr1, int[]arr2)
	{
		
		ArrayList<Integer> al = new ArrayList<>();

		for(int i=0 ; i<arr1.length; i++)
		{
			if(arr1[i] == arr2[i])
			{
				al.add(arr1[i]);
			}
		}
		al.toArray();
	
		System.out.println("Here is the arrary with matching elements" + al);
		
	}

}
