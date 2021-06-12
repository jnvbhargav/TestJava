import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the numbers to be swapped");
		int x = S.nextInt();
		int y = S.nextInt();
		
		//swapmethod1(x,y);
		//swapmethod2(x,y);
		swapmethod3(x,y);
		S.close();

	}
	
	public static void swapmethod1(int x, int y)
	{
		int temp = 0;
		
		temp = x;
		x = y; 
		y = temp;
		
		System.out.println("Here are the swapped Numbers X: " + x + " Y: " + y + " Using method 1");
		
	}
	
	public static void swapmethod2(int x, int y)
	{
		 x = x+y;
		 y = x-y;
		 x = x-y;
		 
		System.out.println("Here are the swapped Numbers X: " + x + " Y: " + y + " Using method 2");

	}
	
	public static void swapmethod3(int x, int y)
	{
		//y = x+y -(x=y);
		
		//Method 4 using XOR Butwise operator
		 x = x^y;
		 y = x^y;
		 x = x^y;
		
		System.out.println("Here are the swapped Numbers X: " + x + " Y: " + y + " Using method 3");

		
	}

}
