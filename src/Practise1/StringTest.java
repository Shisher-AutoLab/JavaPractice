package Practise1;

public class StringTest {

	public static void main(String[] args) {

		
		
		String s1 = "shisher";
		String s2 = new String("shisher");
		
		if(s1==s2) {
			System.out.println("Equals == operator");
		}
		if(s1.equals(s2)) {
			System.out.println("Equals operator");
		}
		
		int i = s1.compareTo(s2);
		System.out.println("compare" +i);
	}

}
