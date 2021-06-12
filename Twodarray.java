
public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3},{2,3,4},{4,5,6}};
		
		System.out.println("First Matrix is ");
		for(int m[]: arr)
		{
			for(int n:m)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		
	    int arr2[][]= {{1,0,0},{0,1,0},{0,0,1}};
	    
		
		System.out.println("Second Matrix is ");
		for(int p[]: arr2)
		{
			for(int q:p)
			{
				System.out.print(q + " ");
			}
			System.out.println();
		}
		
		System.out.println();

	    int c[][] = new int[3][3];
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j] + " ");
				
				c[i][j] = arr[i][j] + arr2[i][j];
			}
			System.out.println();
		}

		System.out.println("Sum of 2 Matrices is ");
		for(int x[]: c)
		{
			for(int y:x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		
		
		//Multiplication of 2 3X3 Matrices
		System.out.println("Multiplication of the Matrix is ");
		
		int m[][] = new int[3][3];
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr2.length; j++)
			{
				for(int k=0; k<3; k++)
				{
					m[i][j] = m[i][j]+  arr[i][k] * arr2[k][j];
				}
			}
		}
		
		for(int a[]: m)
		{
			for(int b:a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

	
}
