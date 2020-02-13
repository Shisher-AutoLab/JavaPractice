package Practise1;

public class Palindrome {

	public static void palindrome(int num) {
		int temp = num;
		int c = 0;

		while (temp > 0) {
			c = (c * 10) + (temp % 10);
			temp = temp / 10;
		}
		System.out.println(c);
		
		if(c==num) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome(145);

	}

}
