package practice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int a = 121;
		int temp=a;
		int c = 0;
		
		while(temp!=0) {
			c = (c*10) + (temp%10); //0+1 = 1, 
			temp = temp/10;
		}
		System.out.println(c);
		
		
		
		
		
	}

}
