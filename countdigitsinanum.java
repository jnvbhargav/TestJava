import java.util.Scanner;

public class countdigitsinanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int givennum = s.nextInt();
		countdigits(givennum);
		
		countevenodddigits(givennum);
		
		s.close();

	}
	
	public static void countdigits(int givennum)
	{
		int count = 0;

		while(givennum > 0)
		{
			givennum = givennum/10;
			count++;
		}
		
		System.out.println("number of digits in the given number are " + count);
	}
	
	public static void countevenodddigits(int givennum)
	{
		int count = 0;
		int digit = 0;
		int even = 0;
		int odd = 0;

		while(givennum > 0)
		{
			digit = givennum % 2;
			if(digit==0)
				even++;
			else
				odd++;
			
			givennum = givennum/10;
			count++;
		}
				
		System.out.println("number of Even digits in the given number are " + even);

		System.out.println("number of Odd digits in the given number are " + odd);

	}

}
