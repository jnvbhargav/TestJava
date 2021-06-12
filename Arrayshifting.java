
public class Arrayshifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,6,7,8,9};
		int temp = 0;
		
		temp = arr[0];
		for (int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		
		for(int x: arr)
		{
			System.out.print(x);
		}
	}

}
