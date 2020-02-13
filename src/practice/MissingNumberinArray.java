package practice;

public class MissingNumberinArray {

	public static void main(String[] args) {

		String s = "Shisher";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char a = s.charAt(i);
			s1 = s1 + a;
		}
		System.out.println(s1);
	}

}
