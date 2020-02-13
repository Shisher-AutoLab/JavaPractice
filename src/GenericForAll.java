import java.util.Arrays;

public class GenericForAll {

	public static void charOccureance(int arr[]) {

	}

	public static void main(String[] args) {

		String s = "i love india";

		for (int i = 0; i < s.length(); i++) {
			int counter = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					counter++;
				}
				if (j < i && s.charAt(i) == s.charAt(j)) {
					break;
				}
				if (j == s.length() - 1) {
					System.out.println("Char at " + s.charAt(i) + " " + counter);
				}
			}
		}

	}
}
