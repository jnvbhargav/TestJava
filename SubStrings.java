
public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "10101";
		
		
		int result = countBinarySubstrings(str);
		
		System.out.println("Number of Substings can be made are " + result);
		

	}
	
	 public static int countBinarySubstrings(String s) {
	        int ans = 0, prev = 0, cur = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i-1) != s.charAt(i)) {
	                ans += Math.min(prev, cur);
	                System.out.println(ans);
	                prev = cur;
	                cur = 1;
	            } else {
	                cur++;
	            }
	        }
	        return ans + Math.min(prev, cur);
	    }

}
