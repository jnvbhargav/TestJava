import java.util.Scanner;

public class ReverseANumb {

	public static void main(String[] args) {
		//int givenNum = 12345;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int givenNum= s.nextInt();
		
		reversenum(givenNum);
		isPalindrome(givenNum);
		s.close();
}

	public static int reversenum(int givennumber)
	{
		
		int temp=0;
		int revnum=0;
				
		while (givennumber > 0)
		{
			temp = givennumber % 10;
			revnum = temp + revnum*10;
			givennumber = givennumber/10;
		}
		
		System.out.println("Here is the reversed number: " + revnum);
	
		return revnum;
	}
	
	public static void isPalindrome(int givenNum)
	{
		int reverseNum = reversenum(givenNum);
		if (reverseNum == givenNum)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Given Number is not Palindrome");
	}
		
	}