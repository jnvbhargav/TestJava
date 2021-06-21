package javaProblemSolving;

public class ReverseraString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Reverse a String
				
		String str= "Bhargav";
		String rev ="";
		
		int length = str.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
		
		
		
		//Reverse a Number
		
		int num = 123456;
		int revNum=0;
		int rem=0;
		
		System.out.println("Given Number is " + num);
		while(num>0)
		{
			rem = num % 10;
			revNum = revNum*10 + rem;
			num = num/10;
			System.out.println(num);
		}

		System.out.println("Here is the Reversed Number " + revNum);
		
		
	}

}
