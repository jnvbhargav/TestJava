package javaProblemSolving;

import java.util.HashMap;
import java.util.HashSet;

public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,2,1};
		
		
		//Using Hash Map
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int item:arr )
		{
			System.out.println();
			if(hm.containsKey(item))
			{
				System.out.println("Here is the First Duplicate Number : "  + item);
				break;
			}
			else
			{
				hm.put(item, 1);
				System.out.println("Number Added  " + item);
			}
		} 
		
		
		//Using HashSet
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int item:arr )
		{
			if(!hs.add(item))
			{
				System.out.println("Here is the First Duplicate Number using HashSet : "  + item);
				break;
			}
		}
	}

}
