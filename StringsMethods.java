
public class StringsMethods {

	public static void main(String[] args) {
	
		char c[] = {'H','e','l','l','o','B'};
		
		//String Index starts from 2 and 3 values
		String str = new String(c,2,3);
		
	
		int length = str.length();
				
		System.out.println("Printing the indexed string converted by chracter array " + str);
		System.out.println("Length of the indexed string  is " + length);
		System.out.println("Printing the character Array " + c);
		
		
		String labelUpper= "BHARGAV";

		String labelLower= "bhargav";
		
		System.out.println("String converted to lowercase " + labelUpper.toLowerCase());
		
		System.out.println("String converted to Upper case " + labelLower.toUpperCase());

		//Trim
		String strSpaces = "      WELCOME       ";
		System.out.println("String " + strSpaces + "With removed spaces using Trim " + strSpaces.trim());
		
		//SubString
		System.out.println("SubString usring the index parameters "+ labelLower.substring(2,5));
	
		//Replace
		String temp;
		temp = labelLower.replace('a', '@');
		System.out.println("Replacing " + labelLower + " a with @ " + temp);
		
		//Starts with or Ends with 
		String website = "www.html.com";
		System.out.println("Does the website starts with www ? " + website.startsWith("www"));
		System.out.println("Does the website Ends with .com ? " + website.endsWith(".com"));
		
		//Index of and Last Index of 
		int index = website.indexOf('.');
		System.out.println("Starting of the first . is " + index );
		int lastIndex = website.lastIndexOf('.');
		System.out.println("Starting of the first . is " + lastIndex );
		
		
		System.out.println(website);
		String strArray[] = website.split(".");
		int strArrayLen = strArray.length;
		System.out.println("String Array Length is " + strArrayLen);
		
		//System.out.println(strArray[1]);
		
		
		
		
		
		

	}
}
