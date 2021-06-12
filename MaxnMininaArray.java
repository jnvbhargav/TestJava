import java.util.Scanner;

public class MaxnMininaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int givennum = s.nextInt(); */
		
		int givennum[] = {100,10,6,7,8,99};
		MinAndMax(givennum);
		
	}

	public static void MinAndMax(int givennum[])
	{
		int minNum = givennum[0];
		int maxNum = givennum[0];
		
		for (int i=0; i< givennum.length-1; i++)
		{
			if (givennum[i+1] > maxNum)
			{
				maxNum = givennum[i+1];
			}
			else if (givennum[i+1] < minNum)
			{
				minNum = givennum[i+1];
			}
		}
		
		System.out.println("Max Number in the given array is " + maxNum);
		System.out.println("Max Number in the given array is " + minNum);

		
	}
}
