

public class OccurencOfNumberInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 1, 3, 2 };
		String str = "shisher mishra";

		for (int k = 0; k < str.length(); k++) {
			int count = 0;

			for (int m = 0; m < str.length(); m++) {

				if (str.charAt(k) == str.charAt(m)) {

					count++;
				}
				
				if (m<k && str.charAt(k) == str.charAt(m)) {
					break;
				}
				
				if (m==str.length()-1) {
					System.out.println("Character " +str.charAt(k)+ " Equals " +count);
				}
			}
		}

		/*for (int i = 0; i < a.length; i++) {
		 * +.
			int counter = 0;
			for (int j = 0; j < a.length; j++) {

				if (j < i && a[i] == a[j]) {
					break;
				}
				if (a[i] == a[j]) {
					counter++;
				}
				if (j == a.length - 1) {
					System.out.println("Character of " + a[i] + " is equal to " + counter);
				}
			}

		}*/

	}

}
