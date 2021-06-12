import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
  
		//Sum of all the elements in the array
		//Find the maximum element in the array
		//Find the second maximum element in the array
		
	int Arr[] = {3,4,1,5,67,3,67};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element to be searched for");
	int ele = sc.nextInt();
	boolean elefound= false;
	int maxele = 0;
	int secondmaxele = 0;
	sc.close();
	
	int sum=0;
	for(int x : Arr)
	{
		sum = sum+x;
		if(ele == x)
		{
			elefound = true;
		}
		if(x > maxele)
		{
			secondmaxele = maxele;
			maxele = x;
		}
	}
	
	System.out.println("Sum of the elements in an array is " + sum);
	
	System.out.println("Element "+ ele + " search status is " + elefound);
	
	System.out.println("Maximum element in the Array is " + maxele + "And second Max is "+ secondmaxele);
	
	}

}
