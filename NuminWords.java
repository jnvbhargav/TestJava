import java.util.Scanner;

public class NuminWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to be reversed");
		
		Scanner sc = new Scanner(System.in);
		
		int givennum = sc.nextInt();
		
		sc.close();
		int revNum =0;
		int rem =0;
		String strNum="";
		
		while(givennum>0)
		{
			rem = givennum%10;
			revNum = revNum*10+ rem;
			strNum = strNum+rem;
			givennum = givennum/10;
		}

		System.out.println("Reversed Number is " + strNum);
		
		for(int j=strNum.length()-1; j>=0; j--)
		{
			switch(strNum.charAt(j))
			{

			case '1': System.out.print("ONE");
				break;
				
			case '2': System.out.print("TWO");
			break;

			case '3': System.out.print("THREE");
			break;

			case '4': System.out.print("FOUR");
			break;

			case '5': System.out.print("FIVE");
			break;

			case '6': System.out.print("SIX");
			break;

			case '7': System.out.print("SEVEN");
			break;

			case '8': System.out.print("EIGHT");
			break;

			case '9': System.out.print("NINE");
			break;

			case '0': System.out.print("ZERO");
			break;

			default: System.out.print("Error Occurred");
			break;
		
			}
		}
	}

}
