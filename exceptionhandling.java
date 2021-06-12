
public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
