package Practise1;

public class CountCharacter {

	public static void main(String[] args) {


		String s = "fasdfa1fa35sd4f6";
		
		for (int i = 0; i< s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (Character.isDigit(c)) {
				System.out.println(s.charAt(i));
			}
		}
		
		
	}

}
