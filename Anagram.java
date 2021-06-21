package javaProblemSolving;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Listen";
		String str2 = "Silent";
		
		if(!Anagramcheck(str1,str2))
		{
			System.out.println("Given Strings are Not Anagrams");
		}
		else
		{
			System.out.println("Given Strings are Anagrams");

		}
	}
	
	public static boolean Anagramcheck(String str1, String str2)
	{
		int l1=0, l2 =0;
		
		l1 = str1.length();
		l2 = str2.length();
		
		if(l1 != l2)
		{
			return false;
		}

		char[] c1= str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0; i<l1 ; i++)
			
		{
			if(c1[i] != c2[i])
			{
				System.out.println(c1[i] + " " + c2[i]);
					return false;
			}
		}		
		return true;
	}

}
