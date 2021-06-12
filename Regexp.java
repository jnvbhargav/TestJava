
public class Regexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "b";
		
		//str.matches("[.]")   -- Any single character
		//str.matches("[abc]")  Single character matching a/b/c
		//str.matches("[^abc]")  Single character matching Other than a/b/c
		//str.matches("[a-z][0-9]") it should be one character and one number ex: a7
		
		//str.matches("\\w")  matches any alphabet or digit 
		
		//str.matches("\\W") returns true if it is other than  any ALPHABET/digit EX:$

		
		//str.matches("\\d") returns true if it matches with any digit 
		
		//str.matches("\\D") returns true if it is other than  any digit
		
		//str.matches("\\S") returns true if it is SPACE

		//str.matches("[a-z]*") Matches any number of digits
		
		
		System.out.println(str.matches("[abc]"));
		
		
		String emailID = "Bhargav@GMAIL.COM";
				
		System.out.println(emailID.matches(".*GMAIL.*"));
		
		System.out.println(emailID.matches("\\w*@GMAIL.*"));


		//Split Username and Domain name from a email ID
		String userEmailID = "bhargav@gmail.com";
		String userName,domainName;
		
		domainName = userEmailID.substring(userEmailID.indexOf("@")+1);
		System.out.println("Domain Name: " + domainName);
				
		userName = userEmailID.substring(0,userEmailID.indexOf("@"));
		System.out.println("User Name: " + userName);
		
		//Validate Domain name belong to Gmail
		System.out.println("Provided domain name matches with Gmail " + domainName.matches("gmail.com"));

		
		//Validate the Date format is correct
		String Date = "22/12/2222";
	    boolean dateFormat = Date.matches( "[0-3][0-9]/[01][0-9]/[0-9]{4}");
	    System.out.println("Provided Date format is  " + dateFormat);
		
		//Remove special characters from a string
	    String line = "a!B@c#d$12%";	   
	    System.out.println(line.replaceAll("[^a-zA-Z0-9]",""));
	    
	    //Remove extra spaces from string
	    String removeSpaces = "asb asaASA 323 as## # # ";
	    System.out.println(removeSpaces.replaceAll("\\s+"," "));
	    
	    //Find number of words in a string
	    String multipleWords = "Hello Iam from Dublin";
	    String words[] = multipleWords.split(" ");
	    int lengthArray = words.length;
	    System.out.println("Length of the Array is " + lengthArray);
	    
	}

}
