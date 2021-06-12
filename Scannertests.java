import java.util.Scanner;

public class Scannertests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 2 numbers");
		Scanner s = new Scanner(System.in);
		//int number = s.nextInt();
		//int number1 = s.nextInt();
		
		//String str = s.next();

		//String Line = s.nextLine();
		Integer number = s.nextInt();


	//	Boolean isPresent = s.hasNext();

				
		//System.out.println("Entered number is" + number + " " + number12);
		System.out.println(Integer.toBinaryString(number));
		s.close();
	}

}
