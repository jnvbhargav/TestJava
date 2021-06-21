package javaProblemSolving;

import java.util.HashSet;

public class LongestSubStringwithoutRepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenString = "abcabcxyzl";
		
		
		int index1 = 0;
		int index2 = 0;
		int  max =0;
		
		HashSet<Character> hash_set = new HashSet();
		
		int length = givenString.length();
		
		while(index2 < length)
		{
			if(!hash_set.contains(givenString.charAt(index2)))
			{
				hash_set.add(givenString.charAt(index2));
				index2++;
				if(hash_set.size() > max)
					max = hash_set.size();
			}
			else
			{
				hash_set.remove(givenString.charAt(index1));
				index1++;
			}
		}
		
		System.out.println("Maximum length of the non repetive sub string is " + max);

	}

}
