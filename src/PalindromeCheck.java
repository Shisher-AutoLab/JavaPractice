
public class PalindromeCheck {
	
	public static boolean checkPalindrome(String str) {
		
		String temp = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			temp = temp + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(temp)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("Madam"));

	}

}
