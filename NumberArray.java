import java.util.Scanner;

public class NumberArray {

	public static void main(String[] args) {

		
		int ArrayLen =0;
		
		System.out.println("Enter the Length of the Array");
		
		Scanner s = new Scanner (System.in);
		
		ArrayLen = s.nextInt();
		
		System.out.println("Enter the elements of the array have length " + ArrayLen);
		
		int[] arr = new int[ArrayLen];
		
		int sum =0;

		for (int i=0; i<= ArrayLen; i++)
		{
			arr[i] = s.nextInt();
			System.out.println("Array Elements " + i + " is " + arr[i]);
			sum = sum + arr[i];
		}

		System.out.println("Sum of Array elements is " + sum);
		
		s.close();

	} 
}
