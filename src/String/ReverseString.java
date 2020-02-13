package String;


public class ReverseString {

	public static void main(String[] args) {
		
		int a = 121;
		int b = 0;
		int c;
		while (a>0) {
			b = (b*10)+(b%10);
			a = a/10;
		}
		
		if (b==a) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
		   

		
	}
}
