import java.util.Scanner;

public class SumofDigitsinaNum {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number");
		int givennum = S.nextInt();
		
		sumofdigits(givennum);
		
		int arr[] = {1,2,4,5,5};
		sumofarrayelements(arr);
		
		S.close();

	}
	
	public static void sumofdigits(int givennum)
	{
		int sum=0;
		int digit = 0;
		while(givennum>0)
		{
			digit = givennum%10;
			givennum = givennum/10;
			sum = sum + digit;
		}
		System.out.println("sum of Given number is " + sum);
		
	}
	
	
	public static void sumofarrayelements(int arr[])
	{
		int sum = 0;
		for (int i=0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of given array elements is " + sum);
	}


}
