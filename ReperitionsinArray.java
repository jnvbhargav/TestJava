package javaProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;

public class ReperitionsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {1,3,4,2,4,52,1,33,4,5,62,2,4};
		String[] strArray = {"Hi","Hello","hi", "Hello"};
		
		HashMap<Integer, Integer> numRep = new HashMap<>();
		HashMap<Integer, Integer> uniqueNum = new HashMap<>();

		HashMap<String, Integer> strRep = new HashMap<>();
		HashMap<Character, Integer> charRep = new HashMap<>();



		//Repetitions of a Number in an Array
		for(int num : numArray)
		{
			if(numRep.containsKey(num))
			{
				numRep.put(num, numRep.get(num)+1);
			}	
			else
				numRep.put(num,1);
		}
		System.out.println(numRep);
		
		//Find the Unique Numbers in An Array using Hash Map
		for(int num: numArray)
		{
			if(!uniqueNum.containsKey(num))
			{
				uniqueNum.put(num, 1);
			}	
		}
		System.out.println("Here are the Unique Numbers : " + uniqueNum);
		
		//Using Array List
		ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
		for(int num: numArray)
		{
			if(!uniqueArr.contains(num))
			{
				uniqueArr.add(num);
			}	
		}
		System.out.println("Here are the Unique Numbers ArrayList : " + uniqueArr);
		
		//Repetitions of a String in an Array
		for(String str : strArray)
		{
			if(strRep.containsKey(str))
			{
				strRep.put(str, strRep.get(str)+1);
			}	
			else
				strRep.put(str,1);
		}
		System.out.println(strRep);
		

		//Repetitions of a character in a String
		String givenStr = "Bhargav";
		//Repetitions of a Char in an Array
		for(int i = 0 ; i<givenStr.length(); i++)
		{
			if(charRep.containsKey(givenStr.charAt(i)))
			{
				charRep.put(givenStr.charAt(i), charRep.get(givenStr.charAt(i))+1);
			}	
			else
				charRep.put(givenStr.charAt(i),1);
		}
		System.out.println(charRep);
		
		// Non Repetitive Character is 
		//Method 1 using Hash Map
		for(int i = 0 ; i<givenStr.length(); i++)
		{
			if(charRep.get(givenStr.charAt(i))==1)
			{
				System.out.println("Here are the list of Non Repetive Character : " + givenStr.charAt(i) );
			}
		}
		
		//Method 2 by comparing the index of
		
		for(int i = 0 ; i<givenStr.length(); i++)
		{
			if(givenStr.indexOf(givenStr.charAt(i)) == givenStr.lastIndexOf(givenStr.charAt(i)))
			{
				System.out.println("Here are the first Non Repetive Character : " + givenStr.charAt(i) );
				break;
			}
		}
		
}

}
