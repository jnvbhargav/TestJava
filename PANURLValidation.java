import java.util.ArrayList;
import java.util.List;

import sun.net.www.protocol.http.HttpURLConnection;

public class PANURLValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<String> urls = new ArrayList<>();
			urls.add("google.com");
			urls.add("yahoo.com");
			urls.add("Spam");
			urls.add("Invalid URL");
			String currenturl;
			boolean validurl =false;
			for(String str:urls)
			{
				System.out.println(str);
				validurl = validateurlconnection(str);
			}
	}
	
	public static boolean validateurl(String url)
	{
		int index=0;
		index = url.lastIndexOf(".");
		if(index<=0)
		{
			System.out.println("Provided url " +index + url + " is invalid");
			return false;
		}
		else {
			System.out.println("Provided url " +index + url + " is valid");
			return true;
		}
			
		
	}
	public static boolean validateurlconnection(String url) 
	{
		HttpURLConnection 
	}

}
