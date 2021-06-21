package javaProblemSolving;

public class SortedsquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-3,-2,3,4,6,78};
		
		int[] squaredarray = new int[arr.length];
		int left = 0;
		int right = arr.length-1;

		for(int i=right; i>=0; i--)
		{
			if(Math.abs(arr[left]) > arr[right])
			{
				squaredarray[i] = arr[left]* arr[left];
				left++;
			}
			else
			{
				squaredarray[i] = arr[right]* arr[right];
				right--;
			}
		}
		
		for(int i: squaredarray)
		{
			System.out.println("here is the squared array " + i);
		}
	}

}
