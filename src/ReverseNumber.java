
public class ReverseNumber {

	public static int reverseNumber(int num) {

		int a, temp, c = 0;

		while (num != 0) {
			c = (c * 10) + (num % 10);
			num = num / 10;

		}
		return c;
	}

	public static void main(String[] args) {

		System.out.println(reverseNumber(321));

	}
	
	

}
