import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number between 1-4");
		
		//int number = sc.nextInt();
		
		String str = sc.next();
		
		
		//Swtich supports Int chat 'a' and String 
		switch (str)
		{
		case "1": 
			System.out.println("Case 1");
			break;
			
		case "2": 
			System.out.println("Case 2");
			break;
			
		case "3": 
			System.out.println("Case 3");
			break;
			
		case "4": 
			System.out.println("Case 4");
			break;
			
			default:
				System.out.println("You entered the Default case");
				break;
		}
	}

}
