import java.io.*;
import java.io.Serializable;
import java.util.*;

public class AccountStorage {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		
		//Create Account
		//Delete Account
		//View Account
		//View all Accounts
		//Save Accounts
		//Exit
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		
		Account acc = null;
		HashMap<String,Account> accdetails = new HashMap<>();
		
		
		try
		{
			FileInputStream fis = new FileInputStream("Accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		FileOutputStream fos = new FileOutputStream("Accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		System.out.println("Menu");
		
		int choice;
		String accno,name;
		double balance;
		
		do {
			
			System.out.println("1. Create Account");
			System.out.println("2. Delete Account");

			System.out.println("3. View Account");

			System.out.println("4. View All Accounts");

			System.out.println("5. Save Account");
			System.out.println("6. Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			
				case 1: 
					System.out.println("Enter Account Number, Name, Balance");
					accno = sc.nextLine();
					name = sc.nextLine();
					balance = sc.nextDouble();
					acc = new Account(accno,name,balance);
					accdetails.put(accno, acc);
					System.out.println("Account Created for " + name);
				
				break;
			case 2: 
				System.out.println("Enter Account Number to be deleted");
				accno = sc.nextLine();
				
				accdetails.remove(accno);
			
				break;
			case 3: 
				System.out.println("Enter Account Number to be deleted");
				accno = sc.nextLine();
				
				System.out.println("Account Created for " + accdetails.get(accno));
				
				break;
			case 4: 
				for(Account a:accdetails.values())
						System.out.println(a);
				break;
			case 5: 
				break;
			case 6: 
				oos.writeInt(accdetails.size());
				
				for(Account a:accdetails.values())
					oos.writeObject(a);
				break;
			default:
				break;
			}

			
		}while(choice!=5);
		oos.flush();
		oos.close();
		
	}


	class Account implements Serializable
	{
		String AccNo;
		String Name;
		double balance;
		
		Account(){}
		
		Account(String a, String b, double  c)
		{
			this.AccNo = a;
			this.Name = b;
			this.balance = c;
		}
		
		public String tostring()
		{
			return "Account No: " + AccNo +"\n Name"+ Name+"\n Balance"+ balance + "\n";
		}
	}
}
