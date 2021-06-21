package javaProblemSolving;

import java.util.ArrayList;

public class SpiralMatrix {
	
	public static void main(String[] Args)
	{
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		/* 
		 *  1  2  3  4
		 *  5  6  7  8   
		 *  9 10 11 12
		 * 13 14 15 16
		 * 
		 * */
		
		int rows=0,columns=0;
		
		PrintSpiralArray(arr,rows,columns);
		
	}
	
	public static void PrintSpiralArray(int[][] arr,int rows,int columns)
	{
		ArrayList<Integer> Al = new ArrayList<>();
		
		int RowBegin =0;
		int RowEnd = arr.length-1;
		int ColumnBegin = 0;
		int ColumnEnd = arr[0].length -1;
		
		System.out.println(ColumnEnd);
		
		while(RowBegin <= RowEnd && ColumnBegin <= ColumnEnd)
		{
			for(int i=ColumnBegin; i<=ColumnEnd ; i++)
			{
				Al.add(arr[RowBegin][i]);
			}
			RowBegin++;
			
			for(int i=RowBegin; i<=RowEnd; i++)
			{
				System.out.println("arr[i][ColumnEnd]" + "ColumnEnd " + ColumnEnd + arr[i][ColumnEnd]);
				
				Al.add(arr[i][ColumnEnd]);
				
			}
			ColumnEnd--;
			
			if(RowBegin <= RowEnd)
			{
				
				for(int i=ColumnEnd ; i>= ColumnBegin; i-- )
				{
					Al.add(arr[RowEnd][i]);
				}
				RowEnd--;
			}
			
			if(ColumnBegin <= ColumnEnd)
			{
				for(int i=RowEnd; i>= RowBegin; i--)
				{
					Al.add(arr[i][ColumnBegin]);
				}
				ColumnBegin++;
			}
		}

		System.out.println(Al);
		 
	}

}
