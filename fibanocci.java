package javaProblemSolving;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1;
		
		int itr=10;
		int temp;
		
		System.out.print(n1+"\t"+ n2);
		
		for(int i=0; i<itr; i++)
		{
			temp = n1+n2;
			n1=n2;
			n2 = temp;
			
			System.out.print("\t" + temp);
		}

	}

}
