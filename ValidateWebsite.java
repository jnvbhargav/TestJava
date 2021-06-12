import java.net.URL;
import java.util.Scanner;

public class ValidateWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Website details ");
		Scanner sc = new Scanner(System.in);
		String URLAddress = sc.nextLine();
		
		String protocal = URLAddress.substring(0,URLAddress.indexOf(":"));
		
		String ext = URLAddress.substring(URLAddress.lastIndexOf(".")+1);
		
		System.out.println("Protocal is "+ protocal + " Ext is " + ext);
		
	}

}
